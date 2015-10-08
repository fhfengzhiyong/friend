package com.straw.friend.service;

import com.straw.friend.bean.User;

public interface IUserService {
	public User getUserById(String userId);  
	public User getUserByDeviceId(String deviceId);
	public int insertSelective(User user);
	public int updateByPrimaryKey(User user);
}
