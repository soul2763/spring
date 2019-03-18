package kr.co.booktopia.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping(value={"/admin", "/admin/index"})
	public String index() {
		return "/admin/index";
	}
	
	@RequestMapping(value={"/admin/goods", "/admin/goods/index"})
	public String goods() {
		return "/admin/goods/index";
	}
	
	@RequestMapping(value={"/admin/goods/add"})
	public String add() {
		return "/admin/goods/add";
	}
	
	@RequestMapping(value={"/admin/member", "/admin/member/index"})
	public String member() {
		return "/admin/member/index";
	}
	
	@RequestMapping(value={"/admin/order", "/admin/order/index"})
	public String order() {
		return "/admin/order/index";
	}
	
}







