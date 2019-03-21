package kr.co.booktopia.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.ShopDAO;
import kr.co.booktopia.service.ShopService;
import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Service
public class ShopServiceImpl implements ShopService{
	
	@Inject
	private ShopDAO dao;
	
	@Override
	public void goodsList() {
	
		
	}
	@Override
	public ShopGoodsVO goodsView(String goods_id) {
		return dao.goodsView(goods_id);
	}
	@Override
	public ShopGoodsImageVO goodsDetailImage(String goods_id) {
		return dao.goodsDetailImage(goods_id);
	}
	
	@Override
	public List<String> keywordAutoComplete(String keyword) {
		return dao.goodsKeywordForAutoComplete(keyword);
	}
	
	@Override
	public List<ShopGoodsVO> searchGoods(String searchWord) {
		return dao.searchGoods(searchWord);
	}
	@Override
	public void addGoodsInCart(ShopCartVO vo) {
		dao.addGoodsInCart(vo);
		
	}
	
	@Override
	public boolean findGoodsInCart(ShopCartVO vo) {
		return dao.findGoodsInCart(vo);
	}
	
	@Override
	public Map<String, List<?>> myCartList(String member_id) {
		Map<String, List<?>> cartMap = new HashMap<String, List<?>>();
		
		List<ShopCartVO> myCartList = dao.selectCartList(member_id);
		
		if(myCartList.size() == 0) {
			return null;
		}
		List<ShopGoodsVO> myGoodsList = dao.selectGoodsListForCart(myCartList);
		cartMap.put("myCartList", myCartList);
		cartMap.put("myGoodsList", myGoodsList);
		return cartMap;
	}
	
	
	
}
