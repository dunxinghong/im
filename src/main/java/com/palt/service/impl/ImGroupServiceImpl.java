package com.palt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palt.dao.mybatis.mapper.ImGroupMapper;
import com.palt.entity.ImGroup;
import com.palt.service.ImGroupService;


@Service
public class ImGroupServiceImpl implements ImGroupService {
	
	@Autowired
	private ImGroupMapper imGroupMapper;

	@Override
	public List<ImGroup> getImGroupBycode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}
