package project.backend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
	
	@GetMapping("/test")
	public String testAPI() {
		return "success";
	}

}
