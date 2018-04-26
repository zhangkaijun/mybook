package com.my.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.mapping.StatementType;

import com.my.book.entity.BasicData;

/**
 * @author zhangkj
 *
 */
public interface BasicDataMapper{

	@Insert("INSERT INTO basicData(basic_value,user_id,parent_id,status,updater,creater) VALUES(#{basicValue}, #{userId},"
			+ " #{parentId,jdbcType=INTEGER}, #{status}, #{updater,jdbcType=VARCHAR}, #{creater})")
	@SelectKey(before = true, keyProperty = "id", resultType = Integer.class, statementType = StatementType.STATEMENT, 
		statement="SELECT LAST_INSERT_ID()")
	void insert(BasicData entity);
	
	@Delete("DELETE FROM basicData WHERE id = #{id}")
	void del(String id);
	
	@Select("SELECT * FROM basicData WHERE id = #{id}")
    @Results(id = "map",
    	value = { 
	    @Result(id = true, property = "id", column = "id"),
	    @Result(property = "basicValue", column = "basic_value"),
	    @Result(property = "userId", column = "user_id"),
	    @Result(property = "parentId", column = "parent_id"),
	    @Result(property = "status", column = "status"),
	    @Result(property = "updater", column = "updater"),
	    @Result(property = "updateTime", column = "update_time"),
	    @Result(property = "creater", column = "creater"),
	    @Result(property = "createTime", column = "create_time")
	})
	BasicData findById(String id);
	
	@UpdateProvider(type = MapperUpdateProvider.class, method = "updateBasicData")
	void update(BasicData entity);
	
	@Select("SELECT * FROM basicData WHERE user_id = #{userId} ")
	@ResultMap("map")
	List<BasicData> findByUserId(String userId);
}
