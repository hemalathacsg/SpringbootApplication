package com.example.SpringBootProject.repository;

import com.example.SpringBootProject.entity.Dummy2;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Dummy2Repository extends CrudRepository<Dummy2, Integer> {
List<Dummy2> findAll();
}
