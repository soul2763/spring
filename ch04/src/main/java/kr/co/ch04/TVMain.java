package kr.co.ch04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/*
 * ��¥ : 2019/03/05
 * �̸� : ���漱
 * ���� : Ioc �ǽ��ϱ�
 * 
	������̼� ����
    @Component (@Controller, @Service, @Repository) 
	 - ������ �����̳ʰ� �ش� ������̼� Ŭ������ ��ü������ ���� ������̼�
	@Autowired
	 - ������� �ش� Ÿ�Կ� �´� ��ü�� ���� �޴� ������̼�(����������) 
    @Inject
	 - ������� �ش� Ÿ�Կ� �´� ��ü�� ���� �޴� ������̼�(�ڹ�����)	
	@Resource(name="��ü���̵�")
	 - ������(��ü)������ �Ǵ� ��ü�� 2�� �̻��϶� ���̵� �����ؼ� �����ϴ� ������̼�
 */
public class TVMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		TV stv = (SamsungTV) ctx.getBean("samsungTV");
		TV ltv = (LgTV) ctx.getBean("lgTV");
		
		stv.power();
		stv.chUp();
		stv.soundUp();
		stv.connect();
		
		ltv.power();
		ltv.chDown();
		ltv.soundDown();
		ltv.disconnect();
	}

}











