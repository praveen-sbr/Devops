package com.example.DevOps.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/status")
	public ResponseEntity<String> getStatus()
	{
		return new ResponseEntity<String> ("hello",HttpStatus.OK);
	}

}
