package kr.co.ch06.service;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	
	public void insert() throws Exception {
		System.out.println("�ٽɰ��� - insert ...");
	}
	
	
	public void select() throws Exception {
		System.out.println("�ٽɰ��� - select ...");
	}
	
	
	public void update() throws Exception {
		System.out.println("�ٽɰ��� - update ...");
	}
	
	
	public void delete() throws Exception {
		System.out.println("�ٽɰ��� - delete ...");
		
		// NullPoint ���ܹ߻� 
		String str = null;
		str.toString();
	}
}







