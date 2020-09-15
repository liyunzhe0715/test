package cn.lyz.test;

import cn.lyz.service.PayService;
import cn.lyz.service.impl.AliPay;

import java.util.ServiceLoader;

/**
 * spi测试类
 *
 * @author liyunzhe
 * @create 2020-09-06
 */
public class MainTest {

    private static AliPay aliPay;

    public static void main(String[] args) {
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        load.forEach( PayService -> {
            Class<? extends cn.lyz.service.PayService> aClass = PayService.getClass();
            String name = aClass.getName();
            System.out.println("ClassNmae:"+name);
        });


    }
}
