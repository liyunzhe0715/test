package com.lyz;

import redis.clients.jedis.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * redis测试类
 *
 * @author liyunzhe
 * @create 2020-10-12
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("116.62.12.41",6379);
        jedis.auth("lyz931402");
        System.out.println(jedis.ping());
        jedis.set("k1","v1");
        System.out.println(jedis.get("k1"));
    }

}
