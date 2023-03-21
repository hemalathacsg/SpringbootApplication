package com.example.SpringBootProject.repository;
import com.example.SpringBootProject.entity.Brand_H;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrandRepository_H extends CrudRepository<Brand_H,Integer> {
    List<Brand_H> findAll();
}
