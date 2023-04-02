package com.company;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootChangeServerPortWebAppApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootChangeServerPortWebAppApplication.class);
		Map<String, Object> configMap = new HashMap<>();
		configMap.put("server.port", 8585);

		springApplication.setDefaultProperties(configMap);
		springApplication.run(args);
	}

}
