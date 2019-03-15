package kr.co.sboard.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.dao.BoardDao;
import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDao dao;
	
	
	@Override
	public List<BoardVO> list(int start) {
		return dao.list(start);
	}
	
	@Override
	public int getTotalCount() {
	
		return dao.getTotalCount();
	}
	
	@Override
	public int getPageEnd(int total) {
		int pageEnd = 0;
		
		if(total % 10 == 0) {
			pageEnd = total / 10;
		}
		else {
			pageEnd = (total / 10) + 1;
		}
		
		return pageEnd;
	}
	
	@Override
	public int getLimitStart(String pg) {
		//limit�� start ���
		int start = 0;
		if(pg == null){
			start = 1;
		}
		else{
			start = Integer.parseInt(pg);
		}
		return (start-1)*10;
	}
	
	@Override
	public int getPageCountStart(int total, int limit) {
		return total - limit;
	}
	
	@Override
	public int[] getPageGroupStardEnd(String pg, int pageEnd) {
		int current = 0;
		int[] groupStartEnd = new int[2];
		
		if(pg == null) {
			current = 1;
		}
		else {
			current = Integer.parseInt(pg);
		}
		int currentPage = current;
		int currentPageGroup	= (int)Math.ceil(currentPage/10.0);
		int groupStart	= (currentPageGroup - 1) * 10 + 1;
		int groupEnd	= currentPageGroup * 10;
		
		if(groupEnd > pageEnd){
			groupEnd = pageEnd;	
		}
		groupStartEnd[0] = groupStart;
		groupStartEnd[1] = groupEnd;
		return groupStartEnd;
	}
	@Override
	public int write(BoardVO vo) {
		return dao.write(vo);
		
	}
	
	@Override
	public void fileWrite(BoardVO vo) {
		
		
	}
	
	@Override
	public int fileUpload(HttpServletRequest req, MultipartFile file, int seq) {
		//���� ���ε� ó�� ����
		//������ ����� ���͸� ��μ���
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/";
		
		
		if(!file.isEmpty()) {
			//������ ÷�� �Ǿ��� ��
			FileVO vo = new FileVO();
			String oName = file.getOriginalFilename();
			String ext = oName.substring(oName.lastIndexOf("."));
			
			String uName = UUID.randomUUID().toString() + ext;
			try {
				file.transferTo(new File(path+uName));
			}
			catch (Exception e) {

				e.printStackTrace();
			}
			vo.setSeq(seq);
			vo.setOldName(oName);
			vo.setnewName(uName);
			dao.fileWrite(vo);
			return 1;
		}
		else {
			return 0;
		}
		//���� ���ε� ó�� ��	
	}
	
	@Override
	public FileVO fileDownload(int parent) {
		return dao.fileDownload(parent);
	}
	
	@Override
	public BoardVO view(int seq) {

		return dao.view(seq);
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}
}
