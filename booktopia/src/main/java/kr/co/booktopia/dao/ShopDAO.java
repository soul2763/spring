package kr.co.booktopia.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

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
}
