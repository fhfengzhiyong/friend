package com.straw.friend.service;

import java.util.List;

import com.straw.friend.bean.Joke;

public interface IJokeService {
	public int add(Joke joke);
	public int deleteById(String id);
	public int updateByPrimaryKey(Joke joke);
	public List<Joke> findList();
	public Joke findById(String id);
}
