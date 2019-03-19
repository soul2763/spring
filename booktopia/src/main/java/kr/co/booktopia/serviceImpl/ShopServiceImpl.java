package kr.co.booktopia.serviceImpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.ShopDAO;
import kr.co.booktopia.service.ShopService;
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
}
