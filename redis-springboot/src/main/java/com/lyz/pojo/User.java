package com.lyz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author liyunzhe
 * @create 2020-10-13
 */

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
//在企业中，所有的pojo类都会序列化
public class User implements Serializable {

    private String name;
    private int age;

}
