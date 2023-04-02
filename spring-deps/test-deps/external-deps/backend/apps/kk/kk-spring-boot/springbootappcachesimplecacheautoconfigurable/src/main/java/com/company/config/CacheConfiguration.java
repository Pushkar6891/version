package com.company.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

@EnableCaching
@Configuration
public class CacheConfiguration {

// 	By Default Caching Will be enabled.
// 	If you want to disable Caching comment below code
//	@Bean
//	@Primary
//	public CacheManager noOpCacheManager() {
//		return new NoOpCacheManager();
//	}

}