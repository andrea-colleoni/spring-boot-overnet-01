package corso.spring.clienti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimoController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
