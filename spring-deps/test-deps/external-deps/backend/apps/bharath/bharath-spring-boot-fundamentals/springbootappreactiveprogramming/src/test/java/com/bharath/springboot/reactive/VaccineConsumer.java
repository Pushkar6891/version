package com.bharath.springboot.reactive;

import java.util.function.Consumer;

import com.bharath.springboot.reactive.vaccine.Vaccine;

public class VaccineConsumer implements Consumer<Vaccine> {

	@Override
	public void accept(Vaccine vaccine) {
		System.out.println(vaccine.getName());
		System.out.println(vaccine.isDelivered());
	}

}
