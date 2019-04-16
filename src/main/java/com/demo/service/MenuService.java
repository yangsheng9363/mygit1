package com.demo.service;


import com.demo.mapper.MenuMapper;
import com.demo.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {

    @Resource
    private MenuMapper menuMapper;

    public List<Menu> getMenuList(){
       return menuMapper.getMenuList();
    }

}
