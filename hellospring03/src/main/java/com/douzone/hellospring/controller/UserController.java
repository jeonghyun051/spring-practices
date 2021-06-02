package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller	// @RequestMapping 클래스 + 핸들러(매서드) author bit-user
public class UserController {
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@PostMapping("/join")
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}
	
//	@ResponseBody
//	@RequestMapping(value="/join",method=RequestMethod.POST)
//	public String join() {
//		return "UserController:join";
//	}	
}