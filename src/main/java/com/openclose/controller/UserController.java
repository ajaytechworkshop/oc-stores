package com.openclose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openclose.bean.User;
import com.openclose.config.Constants;
import com.openclose.service.UserService;

@RestController
@RequestMapping(value = Constants.URL_USER_CONTEXT_ROOT)
public class UserController
{
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void createUser(@RequestBody User user)
	{
		userService.save(user);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public void updateUser(@RequestBody User user)
	{
		userService.update(user);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<User> getAllUsers()
	{
		return userService.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable(name = "id") String userId)
	{
		return userService.getUser(userId);
	}
}
