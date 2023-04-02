package com.company.mockito.argument_types;

public class ArgumentDAOClass {

	public double primitiveMethod(int i, float f, double d) {
		return i+f+d;
	}

	public int objectMethod(ParamObject object) {
		return 1;
	}

}
