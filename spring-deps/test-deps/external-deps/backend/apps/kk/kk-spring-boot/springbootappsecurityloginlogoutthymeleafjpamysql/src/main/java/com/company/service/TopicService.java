package com.company.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.company.entities.Topic;

public interface TopicService {
	@Secured({ "ROLE_ADMIN" })
	public abstract List<Topic> getAllTopics();
}
