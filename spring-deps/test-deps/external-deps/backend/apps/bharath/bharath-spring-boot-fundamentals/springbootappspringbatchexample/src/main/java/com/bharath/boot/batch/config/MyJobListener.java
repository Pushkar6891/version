package com.bharath.boot.batch.config;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Job Started : Job Execution is " + jobExecution.getStatus().toString());
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("Job Ended : Job Execution is " + jobExecution.getStatus().toString());
	}

}
