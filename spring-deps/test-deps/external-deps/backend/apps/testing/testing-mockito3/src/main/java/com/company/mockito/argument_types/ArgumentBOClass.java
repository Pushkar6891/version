package com.company.mockito.argument_types;

public class ArgumentBOClass {

	private final ArgumentDAOClass dao;

	ArgumentBOClass(ArgumentDAOClass dao) {
		this.dao = dao;
	}

	public double primitiveMethod(int i, float f, double d) {
		return dao.primitiveMethod(i, f, d);
	}

	public int objectMethod(ParamObject object) {
		return dao.objectMethod(object);
	}
}
