package com.lyz.rabbitmq_springboot.work;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *work模型 消费者
 *
 *@author liyunzhe
 *@create 2020-10-20
 */

@Component
public class WorkCustomer {

    //消费者1
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void receive1(String message){
        System.out.println("message1 = " + message);
    }

    //消费者2
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void receive2(String message){
        System.out.println("message2 = " + message);
    }
}


