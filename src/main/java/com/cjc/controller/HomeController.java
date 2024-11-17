package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;

@Controller
public class HomeController
{

	@RequestMapping("/")
	public String landingPage()
	{
		System.out.println("inside landing page");
		return "index" ;
	}
	
	@RequestMapping("/log")
	public String loginPage()
	{
		System.out.println("inside login Page");
		return "login" ;
	}
	
	@RequestMapping("/reg")
	public String regPage()
	{
		System.out.println("inside registration Page");
		return "registration" ;
	}
	
	@RequestMapping("/logData")
	public String logData(@RequestParam String name , @RequestParam String password)
	{
		System.out.println(name + "" + password);
		return "success" ;
	}
	
	@RequestMapping("/regData")
	public String regData(@ModelAttribute Student student)
	{
      System.out.println(student.getName());
      System.out.println(student.getAddress());
      System.out.println(student.getEmail());
      System.out.println(student.getCnumber());
      System.out.println(student.getGender());
      System.out.println(student.getNumber());
		
		return "success" ;
	}
}
