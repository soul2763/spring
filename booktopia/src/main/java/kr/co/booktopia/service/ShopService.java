package kr.co.booktopia.service;

import java.util.List;
import java.util.Map;

import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

public interface ShopService {
	public void goodsList();
	public ShopGoodsVO goodsView(String goods_id);
	public ShopGoodsImageVO goodsDetailImage(String goods_id);
	
	public List<String> keywordAutoComplete(String keyword);
	public List<ShopGoodsVO> searchGoods(String searchWord);
	
	public boolean findGoodsInCart(ShopCartVO vo);
	public void addGoodsInCart(ShopCartVO vo);
	public Map<String, List<?>> myCartList(String member_id);
}
