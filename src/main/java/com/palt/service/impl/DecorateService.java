package com.palt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.palt.service.ImGroupService;
import com.palt.service.ImGroupUserService;
import com.palt.service.ImUserService;

@Component
public class DecorateService {

	@Autowired
	private ImUserService imUserService;
	
	@Autowired
	private ImGroupService imGroupService;
	
	@Autowired
	private ImGroupUserService imGroupUserService;

	public ImUserService getImUserService() {
		return imUserService;
	}

	public void setImUserService(ImUserService imUserService) {
		this.imUserService = imUserService;
	}

	public ImGroupService getImGroupService() {
		return imGroupService;
	}

	public void setImGroupService(ImGroupService imGroupService) {
		this.imGroupService = imGroupService;
	}

	public ImGroupUserService getImGroupUserService() {
		return imGroupUserService;
	}

	public void setImGroupUserService(ImGroupUserService imGroupUserService) {
		this.imGroupUserService = imGroupUserService;
	}
	
	
}
