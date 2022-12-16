package com.deloitte.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SmartTvStreamingFeignClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SmartTvStreamingFeignClient1Application.class, args);
	}

}
