package kr.co.ch04;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {

	@Resource(name="samsungSpeaker")
	private Speaker speaker;
	
	@Inject
	private Internet internet;
		
	@Override
	public void power() {
		System.out.println("�Ｚ ���� ��!");
	}

	@Override
	public void chUp() {
		System.out.println("�Ｚ ä�� ����!");
	}

	@Override
	public void chDown() {
		System.out.println("�Ｚ ä�� �Ʒ���!");
	}
	
	public void soundUp() {
		speaker.soundUp();
	}
	
	public void soundDown() {
		speaker.soundDown();
	}

	@Override
	public void connect() {
		internet.connect();
	}

	@Override
	public void disconnect() {
		internet.disconnect();
	}

}
