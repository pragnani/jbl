package com.hospo.hub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	
	
	/***
	 * 
	 * This method will be invoked if somebody hits URl with the extensions we have registered in web.xml (*.html, *.htm etc..)
	 * It will navigate to the index page located in WEB-INF/jsp/index.jsp
	 */

	@RequestMapping("/")
	public String welcome()
	{
		return "WEB-INF/jsp/index.jsp";
	}
	
	@RequestMapping(value="/validate", method= RequestMethod.POST )
	public String login()
	{
		System.out.println("validate User");
		return "j_spring_security_check";
	}

	
}
