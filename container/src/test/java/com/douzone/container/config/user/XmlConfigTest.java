package com.douzone.container.config.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.user.User;

@RunWith(SpringJUnit4ClassRunner.class) // 스프링에서 제공해주는 ruuner, 이제 컨테이너 안에서 테스트를 한다.
//@ContextConfiguration(classes= {AppConfig01.class}) class test
@ContextConfiguration(locations= {"/com/douzone/container/config/user/applicationContext02.xml"}) // xml test
public class XmlConfigTest {
	
	@Autowired
	private User user;
	
	@Test
	public void testUserNotNull() {
		assertNotNull(user);
	}
}