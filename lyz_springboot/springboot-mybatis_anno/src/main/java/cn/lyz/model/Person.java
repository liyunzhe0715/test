package cn.lyz.model;


import lombok.Data;

import java.util.Date;

/**
 * @author liyunzhe
 * @create 2020-09-09
 */
@Data
public class Person {
    private int pid;
    private String pname;
    private String addr;
    private int gender;
    private Date birth;
}
