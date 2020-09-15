package cn.tx.sboot.service;

import cn.tx.sboot.model.AnotherComponent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 这是一个配置类
 * @author liyunzhe
 * @create 2020-08-27
 */
@Component
public class MyService {

    @Bean
    @ConfigurationProperties("acme")
    public AnotherComponent getanAnotherComponent(){
        return new AnotherComponent();
    }
}
