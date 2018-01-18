package com.palt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palt.dao.mybatis.mapper.ImUserMapper;
import com.palt.entity.ImUser;
import com.palt.entity.ImUserExample;
import com.palt.entity.ImUserExample.Criteria;
import com.palt.service.ImUserService;

@Service
public class ImUserServiceImpl implements ImUserService {

	@Autowired
	private ImUserMapper imUserMapper;
	
	@Override
	public ImUser getImUserBycode(String code) {
		// TODO Auto-generated method stub
		ImUserExample example=new ImUserExample();
		Criteria cri = example.createCriteria();
		cri.andPhoneEqualTo(code);
		List<ImUser> lists =  imUserMapper.selectByExample(example);
		if(lists.size()>0)
			return lists.get(0);
		return null;
	}

}
