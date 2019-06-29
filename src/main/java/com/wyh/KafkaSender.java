package com.wyh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
//发送消息
@Component
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendChannelMess(String topic, String message) {
		kafkaTemplate.send(topic, message);
	}

}
