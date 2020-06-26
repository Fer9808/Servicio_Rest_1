package com.servicio_rest_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.servicio_rest_1.dto.User;
import com.servicio_rest_1.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<User> getAllUsers() {
		String url = "http://localhost:8090/findAllUsers";
		ResponseEntity<List<User>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});
		List<User> users = response.getBody();
		return users;
	}
}
