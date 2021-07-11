package com.cap.hms.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cap.hms.entity.Rooms;


@Repository
public interface Roomrepository extends MongoRepository<Rooms, Integer> {

	

	

	


	

}
