package com.douzone.hellospring.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor02 extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("MyInteceptor02 preHandle(...) called");
		
		// return을 false로 해놓으면 여기만 실행되고 해당 url 화면은 안뜬다.
		return false;
	}

}
