package com.demo.mapper;

import com.demo.model.LoginUser;

import java.util.List;

public interface LoginUserMapper {

    int deleteByPrimaryKey(String loginId);

    int insert(LoginUser record);

    int insertSelective(LoginUser record);

    LoginUser selectByPrimaryKey(String loginId);

    List<LoginUser> selectAll();

    int updateByPrimaryKeySelective(LoginUser record);

    int updateByPrimaryKey(LoginUser record);
}