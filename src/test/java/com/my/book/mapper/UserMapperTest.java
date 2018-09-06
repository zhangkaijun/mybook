package com.my.book.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.my.book.model.UserInfo;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Test
	public void insert() {
		UserInfo record = new UserInfo();
		record.setUsername("admin");
		record.setPassword("admin");
		int result = userinfoMapper.insert(record);
		System.out.println(result);
		System.out.println(record.getId());
	}
	
	@Test
	public void getById() {
		UserInfo entity = userinfoMapper.findById(9);
		List<UserInfo> entitys = userinfoMapper.findByUsername("admin");
		System.out.println(JSON.toJSON(entitys));
		
	}
	
}
