package kr.co.sboard;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sboard.dao.BoardDao;
import kr.co.sboard.dao.MemberDao;
import kr.co.sboard.vo.BoardVO;
import kr.co.sboard.vo.MemberVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-test-context.xml"})
public class BoardDaoTest {
	
	@Inject
	private BoardDao dao;
	
	
	@Test
	public void registerTest() {
		BoardVO vo = new BoardVO();
		vo.setCate("title");
		vo.setTitle("제목 테스트입니다.");
		vo.setContent("내용");
		vo.setUid("abcd123");
		vo.setRegip("129.1.1.1");
		dao.write(vo);
		System.out.println("register 테스트 완료");
	}
}
 