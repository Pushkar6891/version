package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerBean implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		String collectStr = Arrays.stream(args.getSourceArgs()).collect(Collectors.joining(","));
		System.out.println(collectStr);
	
	}

}
