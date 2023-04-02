package com.company.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
//import org.springframework.cache.support.NoOpCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

@EnableCaching
@Configuration
public class CacheConfiguration {

	@Bean
	public CacheManager cacheManager(){
		return new ConcurrentMapCacheManager("ticketsCache");
	}

// 	By Default Caching Will be enabled.
// 	If you want to disable Caching comment below code
//	@Bean
//	@Primary
//	public CacheManager noOpCacheManager() {
//		return new NoOpCacheManager();
//	}

}