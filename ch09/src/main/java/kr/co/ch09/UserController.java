package kr.co.ch09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/user/form")
	public String form() {
		return "/user/form";
	}
	
	@RequestMapping("/user/regist")
	public String regist(UserVO vo, Model model) {
		
		// 뷰로 데이터 전달
		model.addAttribute(vo);
		
		return "/user/regist";
	}
}
