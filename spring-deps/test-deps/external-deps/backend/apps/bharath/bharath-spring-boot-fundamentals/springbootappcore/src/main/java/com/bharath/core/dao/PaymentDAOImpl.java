package com.bharath.core.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAOImpl implements PaymentDAO {

	@Override
	public String doPayment() {
		return "From doPayment() in PaymentDAOImpl";
	}

}
