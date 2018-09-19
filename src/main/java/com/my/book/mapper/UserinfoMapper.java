package com.my.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

import com.github.abel533.mapper.Mapper;
import com.my.book.model.UserInfo;

/**
 * @author zhangkj
 *
 */
@Repository
public interface UserinfoMapper extends Mapper<UserInfo>{

	/*@Insert("INSERT INTO `userinfo`(username, password, email, cellphone, fullname, status) VALUES(#{username}, #{password}, #{email}, #{cellphone}, #{fullname}, #{status})")
	@SelectKey(before = false, keyProperty = "id", resultType = Integer.class, statementType = StatementType.STATEMENT, statement="SELECT LAST_INSERT_ID()")
	int insert(UserInfo entity);
	
	@Delete("DELETE FROM `userinfo` WHERE id = #{id}")
	int del(String id);
	
	@Select("SELECT * FROM `userinfo` WHERE id = #{id}")
	UserInfo findById(int id);
	
	@Select("SELECT * FROM `userinfo` WHERE username = #{username} ")
	List<UserInfo> findByUsername(String username);*/
}
