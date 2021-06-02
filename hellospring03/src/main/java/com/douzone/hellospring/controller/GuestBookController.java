package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * RequestMapping
 * 클래스(타입) 단독 매핑
 * @author bit-user
 * 
 * */

@Controller
@RequestMapping("/guestbook/*")
public class GuestBookController {
	
	@ResponseBody
	@RequestMapping
	public String list() {	// 메서드 이름이 매핑된다.
		return "GuestBookController:list";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {	// 메서드 이름이 매핑된다.
		return "GuestBookController:delete";
	}
}
