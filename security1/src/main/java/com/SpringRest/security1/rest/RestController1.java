package com.SpringRest.security1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1
{
	@GetMapping("/info")
    public String display()
    {
    	return "Training and placement started";
    }
	
	@GetMapping("/moreinfo")
	public String display1()
	{
		return "Training classes starts from tmrw";
	}
}
