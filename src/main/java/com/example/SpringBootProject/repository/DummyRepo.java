package com.example.SpringBootProject.repository;

import com.example.SpringBootProject.entity.DummyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DummyRepo extends JpaRepository<DummyData, Integer> {
    List<DummyData> findAll();
}

