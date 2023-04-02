package com.company.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

@EnableCaching
@Configuration
public class HazelcastConfig {
	
	@Bean
	public Config hazelCastConfig() {
		return new Config().setInstanceName("hazelcast-instance").addMapConfig(new MapConfig().setName("ticketsCache"));
	}
}
