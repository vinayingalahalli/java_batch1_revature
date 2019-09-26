package com.animal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.model.Animal;

@Repository
public interface AnimalDAO extends JpaRepository<Animal, Integer>   {

}
