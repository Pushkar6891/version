package com.company.app.springbootapptest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@ConfigurationProperties
@Validated
@PropertySource(ignoreResourceNotFound = true, value = { "file:src/main/resources/config/application.properties" })
public class ProjectProperties {

	String name;
	String version;
	Boolean messagingused;
	Integer[] zip;
	Myapp myapp;
	Mail mail;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	@Component
	@ConfigurationProperties
	@Validated
	public static class Myapp {
		String language;
		String build;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	@Component
	@ConfigurationProperties
	@Validated
	public static class Mail {
		String host;
		int port;
		String protocol;
	}
}
