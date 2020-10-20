package com.lyz.rabbitmq_springboot;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqSpringbootApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void testHello() {
        rabbitTemplate.convertAndSend("hello","hello world");
    }

    @Test
    public void testWork(){
        rabbitTemplate.convertAndSend("work","work模型");
    }

}
