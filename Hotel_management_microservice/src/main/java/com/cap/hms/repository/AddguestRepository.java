package com.cap.hms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cap.hms.entity.Addguest;

@Repository
public interface AddguestRepository extends MongoRepository<Addguest, Integer>{

}
