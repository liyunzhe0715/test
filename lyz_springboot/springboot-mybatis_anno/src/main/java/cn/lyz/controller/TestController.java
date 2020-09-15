package cn.lyz.controller;

import cn.lyz.mapper.PersonMapper;
import cn.lyz.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyunzhe
 * @create 2020-09-09
 */
@RestController
public class TestController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("selectById")
    public Person selectById() {
        return personMapper.selectById(1);
    }
}
