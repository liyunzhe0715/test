package cn.lyz.controller;

import cn.lyz.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableConfigurationProperties(AcmeProperties.class)
public class YamlController {



    @Autowired
    private AcmeProperties properties1;


    @GetMapping("test")
    public AcmeProperties test(){
        return properties1;
    }


}
