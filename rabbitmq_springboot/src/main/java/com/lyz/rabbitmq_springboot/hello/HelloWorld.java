package com.lyz.rabbitmq_springboot.hello;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author liyunzhe
 * @create 2020-10-20
 */

@Component
@RabbitListener(queuesToDeclare = @Queue(value = "hello")) //指定消费者监听的队列 默认为持久化，非独占 不自动删除的队列
public class HelloWorld {

    @RabbitHandler //指定回调函数
    public void receive1(String message){
        System.out.println("message = " + message);
    }
}
