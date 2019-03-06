package kr.co.ch04;

import org.springframework.stereotype.Component;

@Component
public class LgSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("LG �Ҹ��� ���Դϴ�.");
	}
	
	@Override
	public void soundDown() {
		System.out.println("LG �Ҹ��� ����ϴ�.");
	}
	
}
