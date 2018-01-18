package com.palt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palt.dao.mybatis.mapper.ImGroupUserMapper;
import com.palt.entity.ImGroupUser;
import com.palt.service.ImGroupUserService;

@Service
public class ImGroupUserServiceImpl implements ImGroupUserService {
	
	@Autowired
	private ImGroupUserMapper imGroupUserMapper;

	@Override
	public List<ImGroupUser> getImGroupUserByGroupId(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

}
