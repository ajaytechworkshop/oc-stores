package com.openclose.service;

import java.util.List;

import com.openclose.bean.User;

public interface UserService
{
	public void save(User user);

	public void update(User user);

	public void delete(String id);

	public List<User> getAll();

	public User getUser(String id);
}
