package com.bharath.springdatajpa.coupon.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springdatajpa.coupon.entities.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

}
