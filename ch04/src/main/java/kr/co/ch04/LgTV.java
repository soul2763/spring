package kr.co.ch04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {

	@Resource(name="lgSpeaker")
	private Speaker speaker;
	
	@Autowired
	private Internet internet;
	
	@Override
	public void power() {
		System.out.println("LG ���� ��!");
	}

	@Override
	public void chUp() {
		System.out.println("LG ä�� ����!");
	}

	@Override
	public void chDown() {
		System.out.println("LG ä�� �Ʒ���!");
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




