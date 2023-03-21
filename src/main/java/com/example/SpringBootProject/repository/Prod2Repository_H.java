package com.example.SpringBootProject.repository;

import com.example.SpringBootProject.entity.Product2_H;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Prod2Repository_H extends CrudRepository<Product2_H,Integer> {
    List<Product2_H> findAll();
}
