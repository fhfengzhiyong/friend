package com.straw.friend.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.straw.friend.bean.Circle;
import com.straw.friend.dao.ICircleDao;
import com.straw.friend.service.ICircleService;
@Service("circleService")
public class CircleServiceImple implements ICircleService {
	@Resource
    ICircleDao circleDao;
	public int insert(Circle circle) {
		// TODO Auto-generated method stub
		return this.circleDao.insertSelective(circle);
	}
	public int findAccount() {
		int  i = circleDao.findAccount();
		if(0 == i){
			return 1;
		}
		return i+1;
	}
	public Circle findbyid(String id) {
		// TODO Auto-generated method stub
		return circleDao.selectByPrimaryKey(id);
	}
	public List<Circle> findCircleNoByUserId(String userId) {
		// TODO Auto-generated method stub
		return circleDao.findCircleNoByUserId(userId);
	}
	public int selectCircleByIdPd(String circleId, String passString) {
		// TODO Auto-generated method stub
		return circleDao.selectCircleByIdPd(circleId,passString);
	}

}
