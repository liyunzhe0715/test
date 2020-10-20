package com.lyz.rabbitmq_springboot.topic;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 动态路由模式 消费者
 *
 * @author liyunzhe
 * @create 2020-10-21
 */
@Component
public class TopicCustomer {

    @RabbitListener(
        bindings = @QueueBinding(
                value = @Queue,
                exchange = @Exchange(value = "topics",type = "topic"),
                key = {"user.save","user.*"}
        )
    )
    public void receive1(String message){
        System.out.println("message1 = " + message);
    }

    @RabbitListener(
        bindings = @QueueBinding(
                value = @Queue,
                exchange = @Exchange(value = "topics",type = "topic"),
                key = {"order.#","produce.*","user.*"}
        )
    )
    public void receive2(String message){
        System.out.println("message2 = " + message);
    }
}
