package org.com.project.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping(value="/",method=RequestMethod.GET)
public class MainController {
	private static final Logger logger=LoggerFactory.getLogger(MainController.class);
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String Main() {
		return "home";
	}
}
