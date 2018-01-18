package com.palt.service;

import java.util.List;

import com.palt.entity.ImGroup;
import com.palt.entity.ImGroupUser;
import com.palt.entity.ImUser;

public interface MainService {

	public ImUser getImUserBycode(String code);
	
	public List<ImGroup> getImGroupBycode(String code);
	
	public List<ImGroupUser> getImGroupUserByGroupId(String groupId);
	
}
