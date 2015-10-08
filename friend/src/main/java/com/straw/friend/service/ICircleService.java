package com.straw.friend.service;

import java.util.List;

import com.straw.friend.bean.Circle;

public interface ICircleService {
     int insert(Circle circle);
     int findAccount();
     Circle findbyid(String id);
	List<Circle> findCircleNoByUserId(String userId);
	int selectCircleByIdPd(String circleId, String passString);
}
