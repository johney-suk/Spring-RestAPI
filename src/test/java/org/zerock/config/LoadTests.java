package org.zerock.config;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class LoadTests {

	@Autowired
	private ApplicationContext ctx;
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	public void testTime() {
		
		log.info(timeMapper.getTime());
	}
	
	@Test
	public void testDs() {
		
		log.info(ds);
		try(Connection con = ds.getConnection()){
			log.info(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test // test class´Â Ç×»ó void
	public void testCtx() {
		log.info(ctx);
	}
	
}
