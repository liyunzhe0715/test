package com.lyz;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;


/**
 * redis事务测试类
 *
 * @author liyunzhe
 * @create 2020-10-12
 */
public class TestTX {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("116.62.12.41",6379);
        jedis.auth("lyz931402");

        jedis.flushDB();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","world");
        jsonObject.put("name","liyunzhe");
        //开启事务
        Transaction multi = jedis.multi();
        String result = jsonObject.toJSONString();
        try {
            multi.set("user1",result);
            multi.set("user2",result);
            int i = 1/0;
            multi.exec();
        }catch (Exception e){
            multi.discard();
            e.printStackTrace();
        }finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close();//关闭连接
        }
    }
}
