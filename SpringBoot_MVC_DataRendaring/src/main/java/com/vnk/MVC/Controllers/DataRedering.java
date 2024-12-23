package com.vnk.MVC.Controllers;

import java.net.http.HttpRequest;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DataRedering {
	@RequestMapping("/map")
	public String ProcessByMap(Map<String,Object> map) {
		map.put("name","Venkataramana" );
		map.put("phone",9100802854l);
		map.put("add","kotha Singanamama");
		map.put("age",21);
		map.put("gender","Male");
		map.put("Rederingtype", "Map");
		return "usingmap";
	}
	

	@RequestMapping("/model")
	public String ProcessByModel(org.springframework.ui.Model model) {
		model.addAttribute("name", "Venkataramana");
		model.addAttribute("phone", 9100802854l);
		model.addAttribute("add", "kotha Singanamama");
		model.addAttribute("age", 21);
		model.addAttribute("gender", "Male");
		model.addAttribute("Rederingtype", "Model");
		return "usingmap";
	}

			@RequestMapping("/modelMap")
			public String ProcessByMap(ModelMap map) {
				map.addAttribute("name","Venkataramana" );
				map.addAttribute("phone",9100802854l);
				map.addAttribute("add","kotha Singanamama");
				map.addAttribute("age",21);
				map.addAttribute("gender","Male");
				map.addAttribute("Rederingtype", "ModelMap");
				return "usingmap";
			}

	@RequestMapping("/modelAndView")
	public ModelAndView ProcessByMap(ModelAndView map) {
		map.addObject("name", "Venkataramana");
		map.addObject("phone", 9100802854l);
		map.addObject("add", "kotha Singanamama");
		map.addObject("age", 21);
		map.addObject("gender", "Male");
		map.addObject("Rederingtype", "ModelAndView");
		map.setViewName("usingmap");
		return map;
	}
	
	@RequestMapping("/process")
	public String redirectProcess(HttpServletRequest req) {
		req.setAttribute("att", "Hello Good Ofternoon....");
		return"redirect:rend";
	}
	@RequestMapping("/rend")
	public String redirectMapping(HttpServletRequest req) {
		System.out.println(req.getAttribute("att"));
		return"report";
	}
}
