package kr.co.booktopia.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.ShopCartVO;
import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

@Repository
public class ShopDAO {

	@Inject
	private SqlSession mybatis;
	
	public void goodsList() {
		
	}
	
	public ShopGoodsVO goodsView(String goods_id) {
		return mybatis.selectOne("bt.mapper.goods.selectGoodsDetail", goods_id);
	}
	
	public ShopGoodsImageVO goodsDetailImage(String goods_id) {
		return mybatis.selectOne("bt.mapper.goods.selectGoodsImage", goods_id);
	}

	public List<String> goodsKeywordForAutoComplete(String keyword) {
		return mybatis.selectList("bt.mapper.goods.selectKeywordSearchForAutoComplete", keyword);
	}
	
	public List<ShopGoodsVO> searchGoods(String searchWord){
		return mybatis.selectList("bt.mapper.goods.selectGoodsBySearchWord", searchWord);
	}
	
	public void addGoodsInCart(ShopCartVO vo) {
		int cart_id = selectMaxCartId();
		vo.setCART_ID(cart_id);
		
		mybatis.selectList("bt.mapper.goods.insertGoodsInCart", vo);	
	}
	
	public boolean findGoodsInCart(ShopCartVO vo) {
		String result = mybatis.selectOne("bt.mapper.goods.selectCountInCart", vo);
		return Boolean.parseBoolean(result);
	}
	
	public List<ShopCartVO> selectCartList(String member_id){
		return mybatis.selectList("bt.mapper.goods.selectCartList", member_id);
	}
	
	public List<ShopGoodsVO> selectGoodsListForCart(List<ShopCartVO> myCartList){
		return mybatis.selectList("bt.mapper.goods.selectGoodsListForCart", myCartList);
	}
	
	private int selectMaxCartId() {
		return mybatis.selectOne("bt.mapper.goods.selectMaxCartId");
	}
}
