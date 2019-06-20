package com.sachith.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sachith.model.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework decription"),
			new Topic("java", "Core java", "Core java decription"),
			new Topic("javaScript", "JavaScript", "JavaScript decription")
			));

	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
//		for(int i = 0;i<topics.size();i++){
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.set(i,topic);
//			}
//		}
		
		topics.stream().filter(t ->t.getId().equals(id)).map(e-> topic);
	}

	public void deleteTopic(String id) {
//		for(int i = 0;i<topics.size();i++){
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.remove(i);
//			}
//		}
		topics.removeIf(t->t.getId().equals(id));
		
	}

}
