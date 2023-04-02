package com.company.eg01.mockinstancemethodwithoutpowermockito;

class EngineMock extends Engine {
	private int code;

	public void setReturnValue(int value) {
		code = value;
	}

	@Override
	public int start() {
		return code;
	}
}