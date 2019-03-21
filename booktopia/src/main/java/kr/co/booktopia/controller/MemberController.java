package kr.co.booktopia.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.booktopia.service.MemberService;
import kr.co.booktopia.vo.MemberVO;

@Controller
public class MemberController {

	
	@Autowired
	private MemberVO memberVO; //반드시 MemberVO 클래스 상단에 @Component 추가
	
	@Autowired
	private MemberService service;
	
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login(String result, Model model) {
		
		model.addAttribute("result", result);
		
		return "/member/login";
	}

	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public String login(@RequestParam Map<String, String> loginMap, HttpSession session) {
		
		memberVO = service.login(loginMap);
		
		if(memberVO != null) {
			session.setAttribute("isLogon", true);
			session.setAttribute("memberVO", memberVO);
			return "redirect:/index";
		}
		else {
			return "redirect:/member/login?result=fail";
		}
	}
	
	@RequestMapping(value="/member/logout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		session.invalidate();
		mav.setViewName("redirect:/index");
		return mav;
	}
	
	@RequestMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@RequestMapping("/member/mypage")
	public String mypage() {
		return "/member/mypage";
	}
	
	
}
