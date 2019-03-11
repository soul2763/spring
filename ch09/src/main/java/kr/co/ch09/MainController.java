package kr.co.ch09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/hello.do")
	public String Hello() {
		return "/hello";
	}

	@RequestMapping(value="/sub/about1.do")
	public String About1() {
		return "/sub/about1";
	}

	@RequestMapping(value="/sub/about2.do")
	public String About2() {
		return "/sub/about2";
	}
	
	@RequestMapping(value="/sub/about3.do")
	public String About3() {
		return "/sub/about3";
	}
}
