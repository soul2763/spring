package kr.co.sboard.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.sboard.dao.MemberDao;
import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Inject
	private MemberDao dao;
	
	@Override
	public MemberVO login(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.login(vo);
	}
	@Override
	public void register(MemberVO vo) {
		// TODO Auto-generated method stub
		dao.register(vo);
	}
	@Override
	public TermsVO terms() {
		// TODO Auto-generated method stub
		return dao.terms();
	}
}
