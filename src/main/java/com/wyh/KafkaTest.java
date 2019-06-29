package com.wyh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//测试类
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootKafkaApplication.class)
public class KafkaTest {

	@Autowired
	private KafkaSender sender;
	
	@Test
	public void myTest() {
		sender.sendChannelMess("springboot-topic", "test-springboot-kafka-message");
	}
}
