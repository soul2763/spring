package kr.co.booktopia.service;

import kr.co.booktopia.vo.ShopGoodsImageVO;
import kr.co.booktopia.vo.ShopGoodsVO;

public interface ShopService {
	public void goodsList();
	public ShopGoodsVO goodsView(String goods_id);
	public ShopGoodsImageVO goodsDetailImage(String goods_id);
}
