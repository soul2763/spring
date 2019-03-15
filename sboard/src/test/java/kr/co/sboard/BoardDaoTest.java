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
	
	
	
	public void WriteTest() {
		BoardVO vo = new BoardVO();
		vo.setCate("title");
		vo.setTitle("���� �׽�Ʈ�Դϴ�.");
		vo.setContent("����");
		vo.setUid("abcd123");
		vo.setRegip("129.1.1.1");
		int seq = dao.write(vo);
		System.out.println("register �׽�Ʈ �Ϸ�" + seq);
	}
	
	
	@Test
	public void viewTest() {
		dao.view(1136);
	}
	public void getTotalCount() {
		int count = dao.getTotalCount();
		System.out.println("�Խù� ī��Ʈ : " + count);
	}
	
	public void list() {
		
	}
}
 