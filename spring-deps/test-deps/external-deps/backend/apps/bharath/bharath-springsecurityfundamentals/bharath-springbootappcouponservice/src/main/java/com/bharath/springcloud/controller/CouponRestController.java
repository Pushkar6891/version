package com.bharath.springcloud.controller;

import com.bharath.springcloud.model.Coupon;
import com.bharath.springcloud.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
@CrossOrigin
public class CouponRestController {

	private final CouponRepository couponRepository;

	@Autowired
	public CouponRestController(CouponRepository couponRepository) {
		this.couponRepository = couponRepository;
	}

	@PostMapping("/coupons")
	public Coupon create(@RequestBody Coupon coupon) {
		return couponRepository.save(coupon);
	}

	@GetMapping("/coupons/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		return couponRepository.findByCode(code);
	}
}
