package com.openclose.bean.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.openclose.bean.Store;

public interface StoreRepository extends MongoRepository<Store, String>
{

}
