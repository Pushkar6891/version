package com.javatechie.app.EmployeeClient;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;

/**
 * Hello world!
 *
 */
public class EmployeeClient {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Vertx vertx = Vertx.vertx();

		WebClient client = WebClient.create(vertx);

		// post method

		client.post(9090, "localhost", "/addEmployee").sendJson(new Employee(1, "Pushkar Chauhan", "sales", 1000.00),
				response -> {
					if (response.succeeded()) {
						HttpResponse<Buffer> httpResponse = response.result();
						System.out.println("Post Response : " + httpResponse.bodyAsString());
					} else {
						System.out.println("ERROR : " + response.cause().getMessage());
					}
				});
		
		// post method

				client.post(9090, "localhost", "/addEmployee").sendJson(new Employee(2, "Amit Singh", "IT", 2000.00),
						response -> {
							if (response.succeeded()) {
								HttpResponse<Buffer> httpResponse = response.result();
								System.out.println("Post Response : " + httpResponse.bodyAsString());
							} else {
								System.out.println("ERROR : " + response.cause().getMessage());
							}
						});

		// Get Method

		client.get(9090, "localhost", "/getEmployees").send(response -> {
			if (response.succeeded()) {
				HttpResponse<Buffer> httpResponse = response.result();
				System.out.println("GET Response : " + httpResponse.bodyAsString());
			} else {
				System.out.println("ERROR : " + response.cause().getMessage());
			}
		});

		// Get method with Filter parameter

		client.get(9090, "localhost", "/getEmployee/:name").setQueryParam("name", "Pushkar Chauhan").send(response -> {
			if (response.succeeded()) {
				HttpResponse<Buffer> httpResponse = response.result();
				System.out.println("GET Response With Filter: " + httpResponse.bodyAsString());
			} else {
				System.out.println("ERROR : " + response.cause().getMessage());
			}
		});
	}
}
