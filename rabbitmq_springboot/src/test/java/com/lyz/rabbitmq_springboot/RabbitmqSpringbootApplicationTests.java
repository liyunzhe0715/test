package com.lyz.rabbitmq_springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RabbitmqSpringbootApplication.class)
@RunWith(SpringRunner.class)
class RabbitmqSpringbootApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void testHello() {
        rabbitTemplate.convertAndSend("hello", "hello world");
    }

    @Test
    public void testWork() {
        //公平调度，如需实现能者多劳需要额外配置
        rabbitTemplate.convertAndSend("work", "work模型");
    }

    @Test
    public void testFanout(){
        rabbitTemplate.convertAndSend("logs","","fanout模型发送的消息");
    }

    //订阅模式
    @Test
    public void testRoute(){
        rabbitTemplate.convertAndSend("directs","error","发送info的key路由信息");
    }

    @Test
    public void testTopic(){
        rabbitTemplate.convertAndSend("topics","order","发送order的路由信息");
    }



}
