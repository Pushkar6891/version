package com.company.config;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
//import org.springframework.cache.support.NoOpCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

import com.github.benmanes.caffeine.cache.Caffeine;

@EnableCaching
@Configuration
public class CacheConfiguration {

	@Value("${expireAferWrite:24}")
	private int expireAferWrite;

	@Bean
	public Caffeine<Object, Object> caffeineConfig() {
		return Caffeine.newBuilder().expireAfterWrite(expireAferWrite, TimeUnit.MINUTES).recordStats();
	}

	@Bean
	public CacheManager cacheManager(Caffeine<Object, Object> caffeine) {
		CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
		caffeineCacheManager.getCache("ticketsCache");
		caffeineCacheManager.setCaffeine(caffeine);
		return caffeineCacheManager;
	}

// 	By Default Caching Will be enabled.
// 	If you want to disable Caching comment below code
//	@Bean
//	@Primary
//	public CacheManager noOpCacheManager() {
//		return new NoOpCacheManager();
//	}

}