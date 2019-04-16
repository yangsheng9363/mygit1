package com.demo.mapper;

import com.demo.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper {

    @Select("select * from t_menu")
    @Results({
            @Result(property = "menuId",column = "menu_id"),
            @Result(property = "parentMenuId",column = "parent_menu_id"),
            @Result(property = "menuName",column = "menu_name"),
            @Result(property = "url",column = "url"),
            @Result(property = "ord",column = "ord"),
            @Result(property = "img",column = "img")
    })
    public List<Menu> getMenuList();

}
