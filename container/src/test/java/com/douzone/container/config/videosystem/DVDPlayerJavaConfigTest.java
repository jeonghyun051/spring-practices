package com.douzone.container.config.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;


@RunWith(SpringJUnit4ClassRunner.class) // 스프링에서 제공해주는 ruuner, 이제 컨테이너 안에서 테스트를 한다.
@ContextConfiguration(classes=DVDPlayerConfig.class) 
public class DVDPlayerJavaConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	private DigitalVideoDisc dvd;
	
	
	//@Qualifier("dvdPlayer03") // 같은 타입의 빈이 2개이상 존재하는 경우 1.설정 클래스의 빈생성 메서드 이름
	// 설정 클래스의 빈생성 메소드의 @Bean의 name 속성
	@Qualifier("player04")
	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testPlayerNotNull() {
		assertNotNull(player);
	}
	
	@Test
	public void testPlay() {
		player.play();
		assertEquals("Playing Movie MARVEL's Avengers",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}	
}