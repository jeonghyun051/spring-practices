package com.douzone.container.config.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.user.User;

public class AppConfigTest {

	// Java Config
	// 직접 자바 클래스를 전달
	// 설정 클래스에 @Configuration이 필요없다.
	@Test
	public void testAppConfig01() {
		
		// 컨테이너에 등록
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig01.class);
		User user = (User)ac.getBean(User.class);
		assertNotNull(user); // 유저가 null이 아니다. null이면 빨간색 뜬다.
	}
	
	// Java Config02
	// 자바 설정 클래스가 있는 베이스 패키지를 전달
	// 설정 클래스에 @Configuration이 반드시 필요하다.
	@Test
	private static void testAppConfig02() {
		
		// 컨테이너에 등록, 직접 파일 전달하지 않고 패키지를 전달 - @Configuratin 가져다가 사용
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.douzone.container.config.user");
		User user = (User)ac.getBean(User.class);		
	}
}