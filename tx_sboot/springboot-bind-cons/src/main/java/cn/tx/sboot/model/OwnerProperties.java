package cn.tx.sboot.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author liyunzhe
 * @create 2020-08-27
 */
@ConfigurationProperties("acme.my-person.person")
@Data
@Component
@Validated//属性绑定校验注解 需要添加对应依赖
public class OwnerProperties {

    @NotNull
    private String firstName;

    @Max(35)
    private int age;

    @Email
    private String email;
}
