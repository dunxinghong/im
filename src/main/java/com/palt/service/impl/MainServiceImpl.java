package com.palt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palt.dao.mybatis.mapper.util.DecorateMapper;
import com.palt.entity.ImGroup;
import com.palt.entity.ImGroupUser;
import com.palt.entity.ImUser;
import com.palt.service.MainService;

@Service
public class MainServiceImpl implements MainService {
	@Autowired
	private DecorateMapper decorateMapper;
	@Autowired
	private DecorateService decorateService; 

	@Override
	public ImUser getImUserBycode(String code) {
		// TODO Auto-generated method stub
		return decorateService.getImUserService().getImUserBycode(code);
	}

	@Override
	public List<ImGroup> getImGroupBycode(String code) {
		// TODO Auto-generated method stub
		return decorateService.getImGroupService().getImGroupBycode(code);
	}

	@Override
	public List<ImGroupUser> getImGroupUserByGroupId(String groupId) {
		// TODO Auto-generated method stub
		return decorateService.getImGroupUserService().getImGroupUserByGroupId(groupId);
	}
	
	
}
