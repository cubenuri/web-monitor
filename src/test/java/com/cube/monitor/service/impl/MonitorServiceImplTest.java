package com.cube.monitor.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cube.monitor.domain.Monitor;
import com.cube.monitor.service.MonitorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MonitorServiceImplTest {

	@Autowired
	MonitorService monitorService;
	
	@Before
	public void setUp() throws Exception {
		Monitor mon = new Monitor();
		mon.setNmService("다음");
		mon.setUrlService("http://daum.net");
		monitorService.create(mon);
	}
	
	@Test
	public void testGet() {
		Optional<Monitor> mon =  monitorService.get(1);
		
		assertThat("다음", is(mon.get().getNmService()));
	}
	 
	@Test
	public void testUpdate() {
		Optional<Monitor> mon =  monitorService.get(1);
		mon.get().setNmService("네이버");
		mon.get().setUrlService("http://naver.com");
		monitorService.update(mon.get());
		
		mon =  monitorService.get(1);  
		assertThat("네이버", is(mon.get().getNmService()));
	}

}
