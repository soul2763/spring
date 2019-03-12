package kr.co.sboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sboard.service.MemberService;
import kr.co.sboard.vo.TermsVO;


@Controller
public class MemberController {

	@Inject
	private MemberService service;
	

	@RequestMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	@RequestMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	@RequestMapping("/member/terms")
	public String terms(Model model) {
		
		TermsVO vo = service.terms();
		
		model.addAttribute(vo);
		return "/member/terms";
	}
}
