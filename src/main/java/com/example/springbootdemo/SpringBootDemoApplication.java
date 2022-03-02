package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

	@RequestMapping(value = "/poblacion", method = RequestMethod.GET)
	public String listPoblacion() {
		List<String> poblaciones = Arrays.asList("Agua Azul \uD83C\uDF0A",
				"Rancho Alegre \uD83E\uDD20",
				"La Chiripa \uD83E\uDD60",
				"Los Lirios \uD83C\uDF38");
		return poblaciones.toString();
	}

	@RequestMapping(value = "/poblacion", method = RequestMethod.POST)
	public String createPoblacion(@RequestParam(required=false) String poblacionId) {
		return "Población with ID " + poblacionId + " has been created ✅";
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
