package com.example.SpringBootProject.repository;
import com.example.SpringBootProject.entity.Product_H;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ProductRepository_H extends CrudRepository<Product_H,Integer> {
    List<Product_H> findAll();
}
