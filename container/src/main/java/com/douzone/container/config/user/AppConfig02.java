package com.douzone.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.douzone.container.user.User;


public class AppConfig02 {

	@Bean
	public User user() {
		return new User("둘리");
	}
}