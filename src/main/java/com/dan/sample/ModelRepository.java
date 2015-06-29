package com.dan.sample;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModelRepository extends MongoRepository<Model,String>{

    List<Model> findByaStringProp(String toFind);
    
    List<Model> findByanIntProp(int toFind);
    
}
