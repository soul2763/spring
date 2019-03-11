package kr.co.ch10.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch10.vo.UserVO;

@Repository
public class UserDao {
	
	@Inject
	private JdbcTemplate jdbc;

	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<UserVO> userList() {
		//List<UserVO> userlist = jdbc.query(SQL.select_list, new UserRowMapper());
		//return userlist;
		
		//mybatis 방식
		return mybatis.selectList("ns_mapper_sql.SELECT_USER_LIST");
	}

	
	public UserVO userView(UserVO vo) {
		return mybatis.selectOne("", vo);
					
	}
	
	public void userRegist(UserVO vo) {
		//spring jdbc 방식
		//Object[] values = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAddr(), vo.getPos(), vo.getDep()};
		//jdbc.update(SQL.insert_user, values);
		
		//mybatis 방식
		mybatis.insert("ns_mapper_sql.INSERT_USER",vo);
	}
}
