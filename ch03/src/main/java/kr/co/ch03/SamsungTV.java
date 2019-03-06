package kr.co.ch03;

public class SamsungTV implements TV {

	private Speaker speaker;
	private Internet internet;
	
	// �����ڸ� ���� ��ü ����
	public SamsungTV(Speaker speaker, Internet internet) {
		this.speaker = speaker;
		this.internet = internet;
	}
	
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
