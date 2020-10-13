package com.lyz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyz.pojo.User;
import com.lyz.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.swing.plaf.synth.SynthSpinnerUI;

@SpringBootTest
class RedisSpringbootApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    void contextLoads() {
        //在企业中，一般不会使用这个原生的方式去编写代码
        /*RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();//获取数据库连接
        connection.flushDb();*/

        redisTemplate.opsForValue().set("mykey","李蕴哲");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

    @Test
    public void test1(){
        redisUtils.set("name","liyunzhe");
        System.out.println(redisUtils.get("name"));
    }

    @Test
    public void test() throws JsonProcessingException {
        //真实的开发一般都使用json来传递对象
        User user = new User("李蕴哲", 3);
        String jsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
