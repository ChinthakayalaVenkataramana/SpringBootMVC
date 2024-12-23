package com.vnk.mvc.Controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHome {
@RequestMapping("/home")
public String showHome() {
	return "welcome";
}

@RequestMapping("/")
public String showHome1() {
	return "welcome";
}

@RequestMapping("/Demo")
public String showHome2() {
	return "login";
}
}
