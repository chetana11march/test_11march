package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer>{

	
}
