package kr.co.ch08;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Inject
	private JdbcTemplate jdbc;

	private String sql_insert = "insert into USER set uid=?, name=?, hp=?, addr=?, pos=?, dep=?, rdate=NOW()";
	private String sql_select_list = "select * from USER";
	private String sql_select_one = "select * from USER where uid=?";
	
	public void insertUser(UserVO vo) {
		
		Object[] values = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAddr(), vo.getPos(), 105};
		jdbc.update(sql_insert, values);
	}

	public List<UserVO> selectUserList() {
		return jdbc.query(sql_select_list, new UserRowMapper());
				
	}
	
	public UserVO selectUserOne(String uid) {
		Object[] values = {uid};
		return jdbc.queryForObject(sql_select_one, values, new UserRowMapper());
		
	}
	
	public void updateUser() {
		System.out.println("update!");
					
	}
	
	public void deleteUser() {
		System.out.println("delete!");
		
	}

	
}
