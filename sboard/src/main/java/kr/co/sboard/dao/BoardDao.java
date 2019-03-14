package kr.co.sboard.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardVO;

@Repository
public class BoardDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public String list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void write(BoardVO vo) {
		mybatis.insert("ns_mapper_sql_board.INSERT_BOARD",vo);
		
	}
	
	public void view() {
		// TODO Auto-generated method stub
		
	}
	
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	public void modify() {
		// TODO Auto-generated method stub
		
	}
}
