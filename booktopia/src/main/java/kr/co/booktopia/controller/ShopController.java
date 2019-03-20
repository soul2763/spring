package kr.co.booktopia.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/shop/keywordAutoComplete")
	public @ResponseBody Map<String, List<String>> keywordAutoComplete(String keyword, HttpServletRequest req, HttpServletResponse resp){
		
		List<String> keywordList = service.keywordAutoComplete(keyword);
		
		//json 데이터 객체 생성(jackson 라이브러리 필요)
		Map<String,List<String>> json = new HashMap<String, List<String>>();
		json.put("keyword",keywordList);
		return json;
	}
	
	@RequestMapping("/shop/search")
	public String search(Model model, String searchWord, HttpServletRequest req, HttpServletResponse resp) {
		List<ShopGoodsVO> goodsList = service.searchGoods(searchWord);
		model.addAttribute("goodsList", goodsList);
		return "/shop/list";
	}
}
