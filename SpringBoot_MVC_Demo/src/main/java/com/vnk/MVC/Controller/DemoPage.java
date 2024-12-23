package com.vnk.MVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/demo")
public class DemoPage {
 @GetMapping("/home")
 public String home() {
	return "Home";
  }
}
