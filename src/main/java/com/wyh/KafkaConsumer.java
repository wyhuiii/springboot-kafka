package com.wyh;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
//消费者
@Component
public class KafkaConsumer {

	//消费者不需要调用，会自己监听topic，然后监听的消息就是参数message
	@KafkaListener(topics = {"springboot-topic"})
	public void receiveMessage(String message) {
		System.out.println(message);
	}
}
