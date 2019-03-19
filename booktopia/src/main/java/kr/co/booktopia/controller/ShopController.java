package kr.co.booktopia.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.booktopia.service.ShopService;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Controller
public class ShopController {

	@Inject
	private ShopService service;
	
	
	@RequestMapping("/shop/list")
	public String list() {
		return "/shop/list";
	}
	
	@RequestMapping("/shop/view")
	public String view(Model model, String goods_id, HttpServletRequest req, HttpServletResponse resp) {
		
		ShopGoodsVO goodsVO = service.goodsView(goods_id);
		ShopGoodsImageVO goodsImageVO = service.goodsDetailImage(goods_id);
		
		model.addAttribute("goodsVO", goodsVO);
		model.addAttribute("goodsImageVO", goodsImageVO);
		
		return "/shop/view";
	}
	
	@RequestMapping("/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@RequestMapping("/shop/cart")
	public String cart() {
		return "/shop/cart";
	}
	
}
