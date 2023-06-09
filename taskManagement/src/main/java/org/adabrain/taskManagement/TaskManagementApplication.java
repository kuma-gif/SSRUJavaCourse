package org.adabrain.taskManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TaskManagementApplication {

	@GetMapping("/")
	public String home() {
		return "AdaBrain";
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}

}
