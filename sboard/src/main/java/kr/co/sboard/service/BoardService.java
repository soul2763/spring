package kr.co.sboard.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.FileVO;

@Service
public interface BoardService {
	public List<BoardVO> list(int start);
	
	public int getTotalCount();
	
	public int getPageEnd(int total);
	
	public int getLimitStart(String pg);
	
	public int getPageCountStart(int total, int limit);
	
	public int[] getPageGroupStardEnd(String pg, int pageEnd);
	
	public int write(BoardVO vo);
	
	public void fileWrite(BoardVO vo);
	
	public int fileUpload(HttpServletRequest req, MultipartFile file, int seq);
	
	public FileVO fileDownload(int parent);
	
	public BoardVO view(int seq);
	
	public void modify();
	
	public void delete();

}
