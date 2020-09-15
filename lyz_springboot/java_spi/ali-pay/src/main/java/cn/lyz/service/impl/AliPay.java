package cn.lyz.service.impl;

import cn.lyz.service.PayService;

/**
 * 阿里支付接口实现类
 *
 * @author liyunzhe
 * @create 2020-09-04
 */
public class AliPay implements PayService {

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
