package kr.co.booktopia.service;

import java.util.Map;

import kr.co.booktopia.vo.MemberVO;

public interface MemberService {
	public MemberVO login(Map<String, String> loginMap);
}
