package com.servicio_rest_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

import com.servicio_rest_1.dto.User;
import com.servicio_rest_1.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
	
    @RequestMapping(value="/getUsuarios", method=RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.getAllUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}