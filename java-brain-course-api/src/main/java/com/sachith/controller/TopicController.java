package com.sachith.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachith.model.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework decription"),
				new Topic("java", "Core java", "Core java decription"),
				new Topic("javaScript", "JavaScript", "JavaScript decription")
				);
	}

}
