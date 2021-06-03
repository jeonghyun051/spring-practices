package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller	// @RequestMapping 클래스 + 핸들러(매서드) author bit-user
public class UserController {
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@ResponseBody
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}	
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		/*
		 *  만일 n이라는 이름의 파라미터가 없는 경우 
		 *  400 bad Request 에러가 발생한다.
		 */
		System.out.println("name:" + name);
		return "UserController.update()";
	}
	
	@ResponseBody
	@RequestMapping("/update2")						
	public String update2(
			@RequestParam(value="n", required = true, defaultValue = "") String name,
			@RequestParam(value="a", required = true, defaultValue = "0") int age) {
		// required를 false로 쓰면 값이 null일때 에러 안뜨고 리턴됨
		// required를 true로 주고 값이 null이면 defaultValue로 ""이 됨
		System.out.println("name:" + name + " " + "age:" + age);
		return "UserController.update()";
	}
	
//	@PostMapping("/join")
//	public String join(UserVo vo) {
//		System.out.println(vo);
//		return "redirect:/";
//	}
	

}