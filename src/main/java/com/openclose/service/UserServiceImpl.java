package com.openclose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclose.bean.User;
import com.openclose.bean.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserRepository userRepo;

	@Override
	public void save(User user)
	{
		userRepo.save(user);
	}

	@Override
	public void update(User user)
	{
		userRepo.save(user);
	}

	@Override
	public void delete(String id)
	{
		userRepo.deleteById(id);
	}

	@Override
	public List<User> getAll()
	{
		return userRepo.findAll();
	}

	@Override
	public User getUser(String id)
	{
		if (userRepo.findById(id).isPresent())
		{
			return userRepo.findById(id).get();
		}
		return null;
	}

}
