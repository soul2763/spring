package kr.co.sboard.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.sboard.dao.MemberDao;
import kr.co.sboard.vo.TermsVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Inject
	private MemberDao dao;
	
	@Override
	public void login() {
		// TODO Auto-generated method stub
		dao.login();
	}
	@Override
	public void register() {
		// TODO Auto-generated method stub
		dao.register();
	}
	@Override
	public TermsVO terms() {
		// TODO Auto-generated method stub
		return dao.terms();
	}
}