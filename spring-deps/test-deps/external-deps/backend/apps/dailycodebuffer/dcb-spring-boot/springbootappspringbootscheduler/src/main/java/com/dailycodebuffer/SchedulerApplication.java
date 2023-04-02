package com.dailycodebuffer;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class SchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);
	}

	// Run every two seconds
	// @Scheduled(fixedRate = 2000L)
	// Once method run is completed delay for two seconds
	// @Scheduled(fixedDelay = 2000L)
	// Once ApplicationContext has Started delay it for two seconds
	// @Scheduled(initialDelay = 2000L)
	// @Scheduled(fixedDelayString = "PT2S",initialDelay = 2000L)
	// @Scheduled(fixedDelayString = "PT2M",initialDelay = 2000L)
	// @Scheduled(fixedDelayString = "PT2H",initialDelay = 2000L)
	// Cron scheduled for every two seconds
	@Scheduled(cron = "*/2 * * * * *")
	public void job() {
		log.info("Job Current Time : " + new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
