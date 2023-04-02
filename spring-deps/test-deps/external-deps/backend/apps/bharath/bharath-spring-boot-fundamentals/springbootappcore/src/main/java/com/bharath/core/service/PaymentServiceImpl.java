package com.bharath.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.core.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO paymentDao;

	public PaymentDAO getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(PaymentDAO paymentDao) {
		this.paymentDao = paymentDao;
	}

	@Override
	public String doPayment() {
		return paymentDao.doPayment();
	}

}
