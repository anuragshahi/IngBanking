package com.tech.banking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/banking")
	public String print() {
		return "index.html";
	}
}
