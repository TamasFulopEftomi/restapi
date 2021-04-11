package com.eftomi.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eftomi.restapi.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
