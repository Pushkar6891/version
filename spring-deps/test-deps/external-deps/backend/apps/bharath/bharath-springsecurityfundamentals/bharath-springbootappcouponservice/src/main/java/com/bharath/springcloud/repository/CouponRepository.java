package com.bharath.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springcloud.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
	Coupon findByCode(String code);
}
