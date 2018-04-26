package com.my.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.mapping.StatementType;

import com.my.book.entity.Userinfo;

/**
 * @author zhangkj
 *
 */
public interface UserinfoMapper {

	@Insert("INSERT INTO userinfo(username, password, email, cellphone, fullName, status, updater, creater) "
			+ "VALUES(#{username},#{password},#{email},#{cellphone},#{fullName},#{status},#{updater},#{creater})")
	@SelectKey(before = false, keyProperty = "id", resultType = Integer.class, statementType = StatementType.STATEMENT, statement="SELECT LAST_INSERT_ID()")
	void insert(Userinfo entity);
	
	@Delete("DELETE FROM userinfo WHERE id = #{id}")
	void del(String id);
	
	@Select("SELECT * FROM userinfo WHERE id = #{id}")
    @Results(id = "map",
    	value = { 
	    @Result(id = true, property = "id", column = "id"),
	    @Result(property = "username", column = "username"),
	    @Result(property = "password", column = "password"),
	    @Result(property = "email", column = "email"),
	    @Result(property = "cellphone", column = "cellphone"),
	    @Result(property = "fullName", column = "fullName"),
	    @Result(property = "status", column = "status"),
	    @Result(property = "updater", column = "updater"),
	    @Result(property = "updateTime", column = "updateTime"),
	    @Result(property = "creater", column = "creater"),
	    @Result(property = "createTime", column = "createTime")
	})
	Userinfo findById(int id);
	
	@Select("SELECT * FROM userinfo WHERE user_id = #{username} ")
	@ResultMap("map")
	List<Userinfo> findByUser(String username);
}
