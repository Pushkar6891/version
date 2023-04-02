package com.javatechie.app.vertex_example;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

/**
 * Hello world!
 *
 */
public class VertexExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Create Vertex
		Vertx vertx = Vertx.vertx();

		// create HTTP Server
		HttpServer server = vertx.createHttpServer();

		// create Router
		Router router = Router.router(vertx);

		Route handler1 = router.post("/message").produces("*/json").handler(routingContext -> {
			HttpServerResponse serverResponse = routingContext.response();
			serverResponse.setChunked(true).end(Json.encodePrettily(new User(567, "Java Techie")));
		});

		server.requestHandler(router::accept).listen(9098);
	}
}
