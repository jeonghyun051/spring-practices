package com.douzone.container.config.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.config.videosystem.mixing.VideoSystemConfig;
import com.douzone.container.videosystem.DVDPlayer;

@RunWith(SpringJUnit4ClassRunner.class) // 스프링에서 제공해주는 ruuner, 이제 컨테이너 안에서 테스트를 한다.
@ContextConfiguration(classes= {VideoSystemConfig.class}) 
public class DVDPlayerMixingConfig02Test {
	
	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testPlayer() {
		assertNotNull(player);
	}
}