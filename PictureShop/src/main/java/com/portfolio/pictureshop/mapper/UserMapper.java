package com.portfolio.pictureshop.mapper;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.portfolio.pictureshop.vo.User;

@Repository
public class UserMapper {

	@Inject
    private SqlSessionTemplate mybatis;
    
	public String getUser() {
		// TODO Auto-generated method stub
		return mybatis.selectOne("com.portfolio.pictureshop.mapper.UserMapper.getUser");
	}

}
