package org.com.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/main", method = RequestMethod.GET)
public class MainController {
	@RequestMapping(value="home", method = RequestMethod.GET)
	public String Main(HttpServletRequest request, HttpServletResponse response) {
		return "home";
	}
}
