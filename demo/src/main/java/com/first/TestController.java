package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	
	@RequestMapping("/home")
	@ResponseBody
	public String homeController() {
		
		return "This is hoe controller";
	}
}
