package kr.co.booktopia.vo;

import org.springframework.stereotype.Component;

@Component
public class ShopCartVO {
	private int CART_ID;
	private int GOODS_ID;
	private String MEMBER_ID;
	private String DEL_YN;
	private String CREDATE;
	private int CART_GOODS_QTY;
	public int getCART_ID() {
		return CART_ID;
	}
	public void setCART_ID(int cART_ID) {
		CART_ID = cART_ID;
	}
	public int getGOODS_ID() {
		return GOODS_ID;
	}
	public void setGOODS_ID(int gOODS_ID) {
		GOODS_ID = gOODS_ID;
	}
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
	public String getCREDATE() {
		return CREDATE;
	}
	public void setCREDATE(String cREDATE) {
		CREDATE = cREDATE;
	}
	public int getCART_GOODS_QTY() {
		return CART_GOODS_QTY;
	}
	public void setCART_GOODS_QTY(int cART_GOODS_QTY) {
		CART_GOODS_QTY = cART_GOODS_QTY;
	}
	
	
	
}
