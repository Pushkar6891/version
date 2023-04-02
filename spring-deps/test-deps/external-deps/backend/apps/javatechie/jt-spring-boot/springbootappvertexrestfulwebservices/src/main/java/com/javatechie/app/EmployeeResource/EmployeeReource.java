package com.javatechie.app.EmployeeResource;

import java.util.ArrayList;
import java.util.List;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

/**
 * Hello world!
 *
 */
public class EmployeeReource {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Hello World!");

		List<Employee> employees = new ArrayList<>();

		Vertx vertx = Vertx.vertx();

		HttpServer server = vertx.createHttpServer();

		Router router = Router.router(vertx);

		/**
		 * @POST Method
		 *
		 */

		Route postHandler = router.post("/addEmployee").handler(BodyHandler.create()).handler(routingContext -> {
			final Employee employee = Json.decodeValue(routingContext.getBody(), Employee.class);
			HttpServerResponse serverResponse = routingContext.response();
			serverResponse.setChunked(true);
			employees.add(employee);
			serverResponse.end(employees.size() + " Employee added successfully...");
		});

		/**
		 * @GET Method
		 *
		 */

		Route getHandler = router.get("/getEmployees").produces("*/json").handler(routingContext -> {
			routingContext.response().setChunked(true).end(Json.encodePrettily(employees));
		});

		/**
		 * @GET Method with Filter
		 *
		 */
		Route getFilterHandler = router.get("/getEmployee/:name").produces("*/json").handler(routingContext -> {
			String name = routingContext.request().getParam("name");
			routingContext.response().setChunked(true).end(Json
					.encodePrettily(employees.stream().filter(emp -> emp.getName().equals(name)).findFirst().get()));
		});

		server.requestHandler(router::accept).listen(9090);
	}
}
