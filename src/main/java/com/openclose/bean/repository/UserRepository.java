package com.openclose.bean.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.openclose.bean.User;

public interface UserRepository extends MongoRepository<User, String>
{

}
