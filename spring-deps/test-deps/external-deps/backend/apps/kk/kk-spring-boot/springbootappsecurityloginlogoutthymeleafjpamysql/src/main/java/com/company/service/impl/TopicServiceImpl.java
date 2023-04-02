package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.TopicDAO;
import com.company.entities.Topic;
import com.company.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDAO topicDAO;

	@Override
	public List<Topic> getAllTopics() {
		return topicDAO.getAllTopics();
	}
}
