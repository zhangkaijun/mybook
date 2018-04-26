package com.my.book.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.my.book.entity.Userinfo;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Test
	public void insert() {
		Userinfo entity = new Userinfo();
		entity.setUsername("admin");
		entity.setPassword("admin");
		userinfoMapper.insert(entity);
		System.out.println(entity.getId());
	}
	
	@Test
	public void getById() {
		Userinfo entity = userinfoMapper.findById(1);
		System.out.println(JSON.toJSON(entity));
		
	}
	
}
