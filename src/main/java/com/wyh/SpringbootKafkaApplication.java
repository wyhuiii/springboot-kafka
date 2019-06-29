package com.wyh;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKafkaApplication {

	//@Autowired
	//private static KafkaSender sender;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaApplication.class, args);
		//sender.sendChannelMess("springboot-topic", "test");
	}

}
