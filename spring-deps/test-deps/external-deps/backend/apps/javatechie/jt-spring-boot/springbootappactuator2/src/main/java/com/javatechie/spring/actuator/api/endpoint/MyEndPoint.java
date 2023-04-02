package com.javatechie.spring.actuator.api.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Endpoint(id = "javatechie", enableByDefault = true)
public class MyEndPoint {

	@ReadOperation
	public MyEndPointResponse features() {
		return new MyEndPointResponse(263872, "Java-Techie", "Active ");
	}

}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class MyEndPointResponse {
	private int id;
	private String name;
	private String status;
}
