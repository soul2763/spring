package kr.co.booktopia.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.coobird.thumbnailator.Thumbnails;

@Controller
public class BaseController {
	
	/*
	 * �̹��� ����� �޼���
	 *  - �� ���ø����̼ǿ��� �̹����� ������� ǥ���� ���� ����� �̹����� ����Ѵ�.
	 *  - �� �������� ǥ���� �̹��� ������ ���� ��� �̹����� ����Ϸ� ����ؼ� �ż��ϰ� ǥ���Ѵ�.
	 *  - pom.xml ����� ���̺귯�� �߰� (thumbnailator-0.4.8.jar)  
	 */
	@RequestMapping("/goods/thumbnail")
	protected void thumbnails(String fileName, String goods_id, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String imgPath = request.getSession().getServletContext().getRealPath("/")+"/resources/goods";
		
		OutputStream out = response.getOutputStream();
		String filePath = imgPath + "/" + goods_id + "/" + fileName;
		File image = new File(filePath);
		
		if(image.exists()) {
			//����� ũ�� ���� �� ���� ���
			Thumbnails.of(image).size(121, 154).outputFormat("png").toOutputStream(out);
		}
		
		byte[] buffer = new byte[1024*8];
		out.write(buffer);
		out.close();
	}
	
	@RequestMapping("/goods/download")
	protected void download(String fileName, String goods_id, HttpServletRequest request, HttpServletResponse response) throws Exception{

		String imgPath = request.getSession().getServletContext().getRealPath("/")+"/resources/goods";
		
		OutputStream out = response.getOutputStream();
		
		String filePath=imgPath+"/"+goods_id+"/"+fileName;
		
		File image = new File(filePath);
		
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Content-Disposition", "attachment; filename="+fileName);
		response.setHeader("Content-Transfer-Encoding", "binary");
		response.setHeader("Pragma", "no-cache");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(image));
		BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
		
		byte buffer[] = new byte[1024*8];
		
		while(true) {
			int read = bis.read(buffer);
			if(read == -1) {
				break;
			}
			
			bos.write(buffer, 0, read);
		}
		bis.close();
		bos.close();
	}
}
