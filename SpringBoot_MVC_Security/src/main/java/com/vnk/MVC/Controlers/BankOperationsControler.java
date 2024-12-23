package com.vnk.MVC.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationsControler {
	
@GetMapping("/")	
 public String showHome() {
	 return "home";
 }

@GetMapping("/offers")
public String showOffers() {
	return "offers";
}

@GetMapping("/denied")
public String accessDenied() {
return "access_denied";	
}

}
