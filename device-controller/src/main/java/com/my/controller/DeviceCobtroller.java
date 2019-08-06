package com.my.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/device")
public class DeviceCobtroller {
	
	@Value("${server.port}")
	private String port;
	
	
	@RequestMapping("/port")
	public String getApplicationPort(){
		
		return port;
	}

}
