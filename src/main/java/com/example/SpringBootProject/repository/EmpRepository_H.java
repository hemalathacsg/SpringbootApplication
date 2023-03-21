package com.example.SpringBootProject.repository;
import com.example.SpringBootProject.entity.Employee_H;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpRepository_H extends CrudRepository<Employee_H,Integer> {
    List<Employee_H> findAll();
}
