package com.servicio_rest_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServicioRest1Application {
	public static void main(String[] args) {
		SpringApplication.run(ServicioRest1Application.class, args);
	}
		
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
