package com.example.cognito.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CognitoController {

	@RequestMapping("/")
	public String login(Principal principal) {
		return "Hello " + principal.getName() ;
		
	}

}