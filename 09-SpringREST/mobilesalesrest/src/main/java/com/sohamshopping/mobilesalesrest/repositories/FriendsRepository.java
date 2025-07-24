package com.sohamshopping.mobilesalesrest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sohamshopping.mobilesalesrest.models.Friend;

public interface FriendsRepository extends MongoRepository<Friend, Integer> {

}
