package cn.lyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liyunzhe
 * @create 2020-09-08
 */
@SpringBootApplication
public class SpringApplicationSrc {

    public static void main(String[] args) {

        /**
         * 1.环境的初始化
         * 2.创建Spring的容器
         * 3.Spring容器中有大量的自动配置类，其中就有内嵌Tomcat启动
         */
        SpringApplication.run(SpringApplicationSrc.class,args);
    }
}
