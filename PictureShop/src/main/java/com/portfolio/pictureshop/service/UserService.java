package com.portfolio.pictureshop.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.pictureshop.mapper.UserMapper;
import com.portfolio.pictureshop.vo.User;

@Service
public class UserService {
	
	@Resource
    UserMapper userMapper;
    
    public String getUser() {
        return userMapper.getUser();
    }

}
