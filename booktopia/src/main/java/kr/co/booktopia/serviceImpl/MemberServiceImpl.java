package kr.co.booktopia.serviceImpl;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.MemberDAO;
import kr.co.booktopia.service.MemberService;
import kr.co.booktopia.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO dao;
	
	@Override
	public MemberVO login(Map<String, String> loginMap) {
		return dao.selectMember(loginMap);
	}
}
