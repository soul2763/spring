package kr.co.ch08;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2019-03-07
 * 이름 : 류경선
 * 내용 : 스프링 JDBC 실습하기
 */
public class JDBCMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		UserService user = (UserService) ctx.getBean("userServiceImpl");
		
		//insert
		UserVO vo = new UserVO();
		vo.setUid("P102");
		vo.setName("이순신");
		vo.setHp("010-9512-3333");
		vo.setAddr("대전");
		vo.setPos("대리");
		vo.setDep(102);
		
		//user.insertUser(vo);
		
		//select
		List<UserVO> list = user.selectUserList();
		for(UserVO u : list) {
			System.out.println("====================");
			System.out.println("uid: "+u.getUid());
			System.out.println("name: "+u.getName());
			System.out.println("rdate: "+u.getRdate());
			System.out.println("--------------------");
		}
		UserVO userOne = user.selectUserOne("P102");
		System.out.println("----Select User One----");
		System.out.println("uid: "+userOne.getUid());
		System.out.println("name: "+userOne.getName());
		System.out.println("rdate: "+userOne.getRdate());
		System.out.println("--------------------");
		
		//update
		user.updateUser();
		
		//delete
		user.deleteUser();
	}

}
