package com.avengers.ems.handlers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerEmployeeHandler {

	@KafkaListener(topics = "external-upstream-publisher" , groupId = "pno-group")
	public void handle(String message) {
		System.out.println(message);
	}

}
