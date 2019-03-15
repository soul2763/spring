package kr.co.sboard.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.service.BoardService;
import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;
import kr.co.sboard.vo.MemberVO;

@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	
	@RequestMapping("/list")
	public String list(Model model, String pg) {
		
		//limit�� start ���
		int start = service.getLimitStart(pg);
		
		//������ ���
		int total = service.getTotalCount();
		int pageEnd = service.getPageEnd(total);
		
		//�� ī���͹�ȣ ���
		int count = service.getPageCountStart(total, start);
		
		//������ �׷� ���
		int[] groupStartEnd = service.getPageGroupStardEnd(pg, pageEnd);
		
		List<BoardVO> list = service.list(start);
		
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("groupStartEnd", groupStartEnd);
		return "/list";
	}
	@RequestMapping("/view")
	public String view(Model model, int seq) {
		
		BoardVO vo = service.view(seq);
		model.addAttribute("vo", vo);
		
		return "/view";
	}
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		
		
		return "/write";
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardVO vo, HttpServletRequest req, HttpSession sess) {
		
		MemberVO member = (MemberVO)sess.getAttribute("member");
		
		vo.setCate("notice");
		vo.setRegip(req.getRemoteAddr());
		vo.setUid(member.getUid());
		
		MultipartFile file = vo.getFname();
		if(!file.isEmpty()) {
			vo.setFile(service.fileUpload(req, file, vo.getSeq()));		
			int parent = service.write(vo);
			
		}
		else {
			service.write(vo);
		}
				
		
		//���� ���ε� ���� ���̺� ����
		
		
		
		return "redirect:/list";
	}
	
	@RequestMapping("/fileDownload")
	public void fileDownload(int parent, HttpServletRequest req, HttpServletResponse resp) {
		
		// �������̺��� �������� ��������
		FileVO vo = service.fileDownload(parent);
		
		String filePath = req.getSession().getServletContext().getRealPath("/");
		filePath += "resources/upload/"+vo.getnewName();
		
		try {
			File file = new File(filePath);
			
			String name = new String(vo.getOldName().getBytes("UTF-8"), "iso-8859-1");
			resp.setHeader("Cache-Control", "no-cache");
			resp.setHeader("Content-Disposition", "attachment; filename="+name);
			resp.setHeader("Content-Transfer-Encoding", "binary");
			resp.setHeader("Pragma", "no-cache");
			
			// ��Ʈ�� ���� : ���� ---- response��ü 
			BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream()); 
			
			
			byte buffer[] = new byte[1024*8];
			
			while(true){
				// Input��Ʈ������ ������ �о����	
				int read = bis.read(buffer);
				if(read == -1){
					break;
				}
				
				// Output ��Ʈ������ ������ ����
				bos.write(buffer, 0, read);
			}
			
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
