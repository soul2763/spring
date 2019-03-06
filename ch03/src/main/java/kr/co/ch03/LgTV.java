package kr.co.ch03;

public class LgTV implements TV {

	private Speaker speaker;
	private Internet internet;
	
	// setter�� ���� ��ü ����
	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	
	// setter�� ���� ��ü ����
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
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




