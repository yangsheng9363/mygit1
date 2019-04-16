package com.demo.controller;


import com.demo.mapper.LoginUserMapper;
import com.demo.model.LoginUser;
import com.demo.model.Menu;
import com.demo.service.MenuService;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/demoTest")
public class DemoController {

    Logger log = Logger.getLogger(this.getClass());


    @Resource
    private MenuService menuService;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private LoginUserMapper loginUserMapper;


    @RequestMapping(value = "/toIndex")
    public String toIndex(){

//        List<Menu> menuList = menuService.getMenuList();
//
//        for (int i = 0; i < menuList.size(); i++) {
//            Menu menu = menuList.get(i);
//            System.out.println("菜单名："+menu.getMenuName());
//        }

//        String sql = "select count(1) from sn_cp_mz@link_tjzlk";
//        Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
//        System.out.println("输出："+i);

//        LoginUser l = loginUserMapper.selectByPrimaryKey("nc");
//        System.out.println(l.getLoginId());

        List<LoginUser> loginUserList = loginUserMapper.selectAll();
        for (int i = 0; i < loginUserList.size(); i++) {
            LoginUser loginUser = loginUserList.get(i);
            System.out.println("登录名："+loginUser.getLoginId());
        }

        return "index";
    }


}
