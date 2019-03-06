package kr.co.ch06.service;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	
	public void insert() throws Exception {
		System.out.println("ÇÙ½É°ü½É - insert ...");
	}
	
	
	public void select() throws Exception {
		System.out.println("ÇÙ½É°ü½É - select ...");
	}
	
	
	public void update() throws Exception {
		System.out.println("ÇÙ½É°ü½É - update ...");
	}
	
	
	public void delete() throws Exception {
		System.out.println("ÇÙ½É°ü½É - delete ...");
		
		// NullPoint ¿¹¿Ü¹ß»ý 
		String str = null;
		str.toString();
	}
}







