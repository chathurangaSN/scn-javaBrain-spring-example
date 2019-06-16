package com.sachith.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topic")
	public String getAllTopics() {
		return "Get All Topoics" ;
	}

}
