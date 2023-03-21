package com.example.SpringBootProject.repository;
import com.example.SpringBootProject.entity.Customerr_H;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CustomerRepository_H extends CrudRepository<Customerr_H,Integer> {
 List<Customerr_H> findAll();

}
