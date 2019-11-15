package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Mostrando para o Spring que esta class sera um controller


/****
 * @param - Controller que sera a home da aplicacao
 * @author Alex Silva
 * {@link} alexdomingos13@icloud.com
 */


@Controller
public class indexController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
