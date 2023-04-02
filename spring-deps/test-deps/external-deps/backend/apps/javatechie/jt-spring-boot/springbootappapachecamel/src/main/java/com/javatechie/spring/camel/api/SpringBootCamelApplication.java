package com.javatechie.spring.camel.api;

import java.util.Arrays;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCamelApplication extends RouteBuilder {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamelApplication.class, args);
	}

	@Override
	public void configure() throws Exception {
		// move data from one file another file
		System.out.println("started...");
		// moveAllFile();
		// moveSpecificFile("myFile");
		// moveSpecificFileWithBody("Java");
		 fileProcess();
		// multiFileProcessor();
		System.out.println("End...");

	}

	public void moveAllFile() {
		from("file:FOLDER_FROM/a?noop=true").to("file:FOLDER_TO/b");
	}

	public void moveSpecificFile(String type) {
		from("file:FOLDER_FROM/a?noop=true").filter(header(Exchange.FILE_NAME).startsWith(type))
				.to("file:FOLDER_TO/b");
	}

	public void moveSpecificFileWithBody(String content) {
		from("file:FOLDER_FROM/a?noop=true").filter(body().startsWith(content))
				.to("file:FOLDER_TO/b");
	}

	public void fileProcess() {
		from("file:fileprocess_source?noop=true").process(p -> {
			String body = p.getIn().getBody(String.class);
			StringBuilder sb = new StringBuilder();
			Arrays.stream(body.split(" ")).forEach(s -> {
				sb.append(s + ",");
			});

			p.getIn().setBody(sb);
		}).to("file:fileprocess_destination?fileName=records.csv");
	}

	public void multiFileProcessor() {
		from("file:multifileprocessor_source?noop=true").unmarshal().csv().split(body().tokenize(",")).choice()
				.when(body().contains("Closed")).to("file:multifileprocessor_destination?fileName=close.csv")
				.when(body().contains("Pending")).to("file:multifileprocessor_destination?fileName=Pending.csv")
				.when(body().contains("Interest")).to("file:multifileprocessor_destination?fileName=Interest.csv");

	}
}
