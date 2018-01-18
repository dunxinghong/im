package com.palt.dao.mybatis.mapper.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palt.dao.mybatis.mapper.ImGroupMapper;
import com.palt.dao.mybatis.mapper.ImGroupUserMapper;
import com.palt.dao.mybatis.mapper.ImUserMapper;

@Component
public class DecorateMapper {

	@Autowired
	private ImUserMapper imUserMapper;
	
	@Autowired
	private ImGroupMapper imGroupMapper;
	
	@Autowired
	private ImGroupUserMapper imGroupUserMapper;

	public ImUserMapper getImUserMapper() {
		return imUserMapper;
	}

	public void setImUserMapper(ImUserMapper imUserMapper) {
		this.imUserMapper = imUserMapper;
	}

	public ImGroupMapper getImGroupMapper() {
		return imGroupMapper;
	}

	public void setImGroupMapper(ImGroupMapper imGroupMapper) {
		this.imGroupMapper = imGroupMapper;
	}

	public ImGroupUserMapper getImGroupUserMapper() {
		return imGroupUserMapper;
	}

	public void setImGroupUserMapper(ImGroupUserMapper imGroupUserMapper) {
		this.imGroupUserMapper = imGroupUserMapper;
	}


	
	
	
	
}
