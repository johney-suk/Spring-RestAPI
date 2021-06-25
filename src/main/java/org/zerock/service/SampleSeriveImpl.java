package org.zerock.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class SampleSeriveImpl implements SampleService {

	@Override
	public String doA() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return LocalDateTime.now().toString();
	}

	
	
}
