package com.straw.friend.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.straw.friend.bean.OaUser;
import com.straw.friend.bean.OaUserRole;
import com.straw.friend.dao.OaUserMapper;
import com.straw.friend.service.IOaUser;
@Service
public class OaUserServiceImpl implements IOaUser {
    
	@Resource
	OaUserMapper oaUserMapper;
	@Override
	public Set<String> findRoles(String username) {
		// TODO Auto-generated method stub
		return this.oaUserMapper.findRoles(username);
	}

	@Override
	public Set<String> findPermissions(String username) {
		// TODO Auto-generated method stub
		return this.oaUserMapper.findPermissions(username);
	}

	@Override
	public OaUser findByUsername(String username) {
		// TODO Auto-generated method stub
		return this.oaUserMapper.findByUsername(username);
	}

}
