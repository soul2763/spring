package kr.co.sboard.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.sboard.dao.BoardDao;
import kr.co.sboard.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDao dao;
	@Override
	public String list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void write(BoardVO vo) {
		dao.write(vo);
		
	}
	@Override
	public void view() {
		// TODO Auto-generated method stub
		
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
