package kr.co.ch02;

public class SamsungTV implements TV {

	@Override
	public void power() {
		System.out.println("�Ｚ TV ���� ��");
	}
	
	@Override
	public void chUp() {
		System.out.println("�Ｚ TV ä�� ����...");
	}
	
	@Override
	public void chDown() {
		System.out.println("�Ｚ TV ä�� �Ʒ���...");
	}
	
}
