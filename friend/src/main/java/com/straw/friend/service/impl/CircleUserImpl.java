package com.straw.friend.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.straw.friend.bean.Circle;
import com.straw.friend.bean.CircleUser;
import com.straw.friend.dao.ICircleUserDao;
import com.straw.friend.service.ICircleUserService;
@Service("circleUserService")
public class CircleUserImpl implements ICircleUserService {
	@Resource
    ICircleUserDao circleUserDao;
	public List<CircleUser> findCircleByUserId(String userId) {
		// TODO Auto-generated method stub
		return this.circleUserDao.findCircleByUserId(userId);
	}

	public List<CircleUser> findCircleByCircleId(String circleId) {
		// TODO Auto-generated method stub
		return this.circleUserDao.findCircleByCircleId(circleId);
	}

	public int add(CircleUser circleUser) {
		// TODO Auto-generated method stub
		return this.circleUserDao.insertSelective(circleUser);
	}

	public List<CircleUser> findCircleNoByUserId(String userId) {
		return this.circleUserDao.findCircleNoByUserId(userId);
	}

}
