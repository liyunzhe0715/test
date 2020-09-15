package cn.lyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @author liyunzhe
 * @create 2020-09-08
 */
@RestController
public class JDBCTemplateController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("query")
    public List<Map<String, Object>> hello(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from tx_user");
        return maps;
    }
}
