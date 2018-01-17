package com.my.book.entity;

import java.util.List;

import com.my.common.BasicEntity;

/**
 * @author zhangkj
 *
 */
public class BasicData extends BasicEntity{

	private String userId;
	private String basicValue;
	private String parentId;
	private List<BasicData> children;
	
	public String getBasicValue() {
		return basicValue;
	}
	public void setBasicValue(String basicValue) {
		this.basicValue = basicValue;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<BasicData> getChildren() {
		return children;
	}
	public void setChildren(List<BasicData> children) {
		this.children = children;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
