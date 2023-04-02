package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		String collectStr = Arrays.stream(args).collect(Collectors.joining(","));
		System.out.println(collectStr);
	}
}
