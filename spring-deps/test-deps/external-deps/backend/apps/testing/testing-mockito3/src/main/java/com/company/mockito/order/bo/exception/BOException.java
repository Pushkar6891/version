package com.company.mockito.order.bo.exception;

import java.sql.SQLException;

public class BOException extends Exception {

	private static final long serialVersionUID = 1L;

	public BOException(SQLException e) {

		super(e);
	}

}
