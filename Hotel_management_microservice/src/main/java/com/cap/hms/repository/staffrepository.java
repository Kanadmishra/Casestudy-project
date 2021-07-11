package com.cap.hms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cap.hms.entity.staff;

@Repository
public interface staffrepository extends MongoRepository<staff, Integer> {

}
