package com.straw.friend.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.straw.friend.bean.Joke;
import com.straw.friend.dao.IJokeDao;
import com.straw.friend.service.IJokeService;
@Service("jokeService")
public class JokeServiceImpl implements IJokeService {
	@Resource
    private  IJokeDao jokeDao;
	public int add(Joke joke) {
		// TODO Auto-generated method stub
		return jokeDao.insert(joke);
	}

	public int deleteById(String id) {
		// TODO Auto-generated method stub
		return jokeDao.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKey(Joke joke) {
		// TODO Auto-generated method stub
		return jokeDao.updateByPrimaryKey(joke);
	}

	public List<Joke> findList() {
		return jokeDao.findList();
	}

	public Joke findById(String id) {
		return jokeDao.selectByPrimaryKey(id);
	}

}
