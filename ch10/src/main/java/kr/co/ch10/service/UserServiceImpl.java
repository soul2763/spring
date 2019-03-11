package kr.co.ch10.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.ch10.dao.UserDao;
import kr.co.ch10.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Inject
	private UserDao dao;

	@Override
	public List<UserVO> userList() {
		return dao.userList();
	}
	@Override
	public void userRegist(UserVO vo) {
		dao.userRegist(vo);
	}
	@Override 
	public void userView(UserVO vo) {
		dao.userView(vo);
	}
}
