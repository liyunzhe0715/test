package cn.tx.sboot.controller;

import cn.tx.sboot.model.AnotherComponent;
import cn.tx.sboot.model.OwnerProperties;
import cn.tx.sboot.model.ValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AnotherComponent anotherComponent;

    @RequestMapping("hello")
    public String hello() {
        return "hello springboot....";
    }

    @RequestMapping("another")
    public String another() {
        System.out.println(anotherComponent);
        return "hello springboot....";
    }

    @Autowired
    private OwnerProperties ownerProperties;

    @RequestMapping("owner")
    public String owner() {
        System.out.println(ownerProperties);
        return "hello springboot....";
    }

    @Autowired
    private ValueProperties valueProperties;

    @RequestMapping("value")
    public String value() {
        System.out.println(valueProperties);
        return "hello springboot....";
    }
}
