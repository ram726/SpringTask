package org.mvc.user.controller;

import org.mvc.user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController 
{
	@RequestMapping("/mvc")
	public String showUser(@ModelAttribute User user,ModelMap map) {
		System.out.println("Checking Controller");
		map.addAttribute("key", "Hey "+user.getName()+", this message is from controller.");
		return "show";
	}
}
