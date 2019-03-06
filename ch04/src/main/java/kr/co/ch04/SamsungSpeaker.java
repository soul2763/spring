package kr.co.ch04;

import org.springframework.stereotype.Component;

@Component
public class SamsungSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("�Ｚ �Ҹ��� ���Դϴ�.");
	}
	
	@Override
	public void soundDown() {
		System.out.println("�Ｚ �Ҹ��� ����ϴ�.");
	}
	
}
