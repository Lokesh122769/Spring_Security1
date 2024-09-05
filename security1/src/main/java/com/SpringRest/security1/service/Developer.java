package com.SpringRest.security1.service;

import org.springframework.stereotype.Service;

@Service
public class Developer
{

	public Developer()
	{
		System.out.println("Developer Bean Created");
	}
	
	public String code()
	{
		return "Development phase Started";
	}
	
	
}
