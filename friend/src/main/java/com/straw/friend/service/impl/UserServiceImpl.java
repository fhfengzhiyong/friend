package com.straw.friend.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.straw.friend.bean.User;
import com.straw.friend.dao.IUserDao;
import com.straw.friend.service.IUserService;
@Service("userService")  
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(String userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
	public User getUserByDeviceId(String deviceId) {
		User serlectByDeviceId = this.userDao.serlectByDeviceId(deviceId);
		return serlectByDeviceId;
	}
	public int insertSelective(User user) {
		return this.userDao.insertSelective(user);
	}
	public int updateByPrimaryKey(User user) {
		// TODO Auto-generated method stub
		return  this.userDao.updateByPrimaryKey(user);
	}

}
