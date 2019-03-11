package kr.co.ch10;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch10.service.UserService;
import kr.co.ch10.vo.UserVO;

@Controller
public class UserController {
	
	@Inject
	private UserService service;
	
	@RequestMapping("/userList")
	public String userList(Model model) {
		List<UserVO> userlist = service.userList();
		
		model.addAttribute("userList", userlist);
		return "/userList";
	}
	
	@RequestMapping(value="/userRegist", method=RequestMethod.GET)
	public String userRegist() {
		return "/userRegist";
		
	}
	
	@RequestMapping(value="/userRegist", method=RequestMethod.POST)
	public String userRegist(UserVO vo) {
		service.userRegist(vo);
		return "redirect:/userList";
	}
	
	@RequestMapping("/userView")
	public String userView() {
		return "/userView";
	}
	
}
