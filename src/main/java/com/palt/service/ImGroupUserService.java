package com.palt.service;

import java.util.List;

import com.palt.entity.ImGroup;
import com.palt.entity.ImGroupUser;
import com.palt.entity.ImUser;

public interface ImGroupUserService {

	public List<ImGroupUser> getImGroupUserByGroupId(String groupId);
}
