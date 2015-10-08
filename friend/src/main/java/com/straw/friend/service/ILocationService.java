package com.straw.friend.service;

import com.straw.friend.bean.Location;

public interface ILocationService {
     int add(Location location);
     Location findByUserId(String userId);
}
