package com.my.common.base.impl;

import java.io.Serializable;
import java.util.List;

import com.my.common.base.BaseMapper;
import com.my.common.base.BaseService;

public abstract class AbstractService<T, ID extends Serializable> implements BaseService<T, ID> {

	private BaseMapper<T, ID> baseMapper;

	public void setBaseMapper(BaseMapper<T, ID> baseMapper) {
		this.baseMapper = baseMapper;
	}

	
}
