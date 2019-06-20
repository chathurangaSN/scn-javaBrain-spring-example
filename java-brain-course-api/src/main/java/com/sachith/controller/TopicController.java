package com.sachith.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachith.model.Topic;
import com.sachith.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {	
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public String addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
		String msg ="added successfuly";
		return msg;
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public String updateTopic(@RequestBody Topic topic,@PathVariable String id){
		topicService.updateTopic(topic, id);
		String msg ="updated successfuly";
		return msg;
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public String deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
		String msg ="deleted successfuly";
		return msg;
	}
	

}
