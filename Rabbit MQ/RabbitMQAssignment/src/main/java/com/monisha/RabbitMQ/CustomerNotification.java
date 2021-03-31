package com.monisha.RabbitMQ;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerNotification {
	
	@Autowired
	private CustomerRepository repository;

	@RabbitListener(queues=MessageConfig.QUEUE)
	public void consumeMessageFromQueue(Customer customer){
		repository.save(customer);
		
	}
}
