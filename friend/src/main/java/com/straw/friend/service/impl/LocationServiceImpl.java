package com.straw.friend.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.straw.friend.bean.Location;
import com.straw.friend.dao.ILocationDao;
import com.straw.friend.service.ILocationService;
@Service("locationService")
public class LocationServiceImpl implements ILocationService {
	@Resource
    ILocationDao location;
	public int add(Location location) {
		// TODO Auto-generated method stub
		return this.location.insert(location);
	}

	public Location findByUserId(String userId) {
		// TODO Auto-generated method stub
		return this.location.findByUserId(userId);
	}

}
