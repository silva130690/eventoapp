package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Mostrando para o Spring que esta class sera um controller


/****
 * 
 * @author Alex Silva
 * @version 0.0.1
 */


@Controller
public class indexController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
