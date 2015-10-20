package com.straw.friend.service;

import java.util.Set;

import com.straw.friend.bean.OaUser;

public interface IOaUser {
	Set<String> findRoles(String username);
	Set<String> findPermissions(String username);
	OaUser findByUsername(String username);
}
