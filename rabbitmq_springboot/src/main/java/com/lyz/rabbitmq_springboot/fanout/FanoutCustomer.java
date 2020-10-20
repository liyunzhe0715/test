package com.lyz.rabbitmq_springboot.fanout;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 广播模式 消费者
 *
 * @author liyunzhe
 * @create 2020-10-20
 */
@Component
public class FanoutCustomer {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,//不指定名字，创建临时队列
            exchange = @Exchange(value = "logs",type = "fanout")//绑定交换机
    ))
    public void receivce1(String message){
        System.out.println("message1 = " + message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,//不指定名字，创建临时队列
            exchange = @Exchange(value = "logs",type = "fanout")//绑定交换机
    ))
    public void receivce2(String message){
        System.out.println("message2 = " + message);
    }
}
