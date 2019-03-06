package kr.co.ch03;

public class SamsungTV implements TV {

	private Speaker speaker;
	private Internet internet;
	
	// 생성자를 통한 객체 주입
	public SamsungTV(Speaker speaker, Internet internet) {
		this.speaker = speaker;
		this.internet = internet;
	}
	
	@Override
	public void power() {
		System.out.println("삼성 전원 켬!");
	}

	@Override
	public void chUp() {
		System.out.println("삼성 채널 위로!");
	}

	@Override
	public void chDown() {
		System.out.println("삼성 채널 아래로!");
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
