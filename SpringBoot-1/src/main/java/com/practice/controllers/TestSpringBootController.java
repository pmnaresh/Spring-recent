package com.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestSpringBootController {
	
	
	@RequestMapping(path ="/hi" ,method=RequestMethod.GET)
	@ResponseBody
	public String callingMethod() {
		return "Success";
	}
	
	

}
