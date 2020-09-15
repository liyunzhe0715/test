package cn.lyz.service.impl;

import cn.lyz.service.PayService;

/**
 * 微信支付实现类
 *
 * @author liyunzhe
 * @create 2020-09-04
 */
public class WxPay implements PayService {

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
