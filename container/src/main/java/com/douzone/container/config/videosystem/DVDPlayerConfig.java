package com.douzone.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;

@Configuration
public class DVDPlayerConfig {
 
	// 명시적으로 bean 설정 , sacn 으로 안함
	@Bean
	public Avengers avenger() {
		return new Avengers();
	}
}
