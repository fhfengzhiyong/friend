package com.straw.friend.service;

import java.util.List;

import com.straw.friend.bean.Circle;
import com.straw.friend.bean.CircleUser;

public interface ICircleUserService {
	List<CircleUser> findCircleByUserId(String suerId);
	List<CircleUser> findCircleByCircleId(String circleId);
	int add(CircleUser circleUser);
	List<CircleUser> findCircleNoByUserId(String userId);
}
