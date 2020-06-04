package com.welcome.jsp.spring.welcomeMVCspringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class welcomeController {

		@GetMapping(path = "/")
		public String welcome() {
			return "welcomepage";
		
	}
}
