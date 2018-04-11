package com.openclose.bean.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.openclose.bean.Stores;

public interface StoresRepository extends MongoRepository<Stores, String>
{

}
