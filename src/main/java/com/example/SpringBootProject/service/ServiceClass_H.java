package com.example.SpringBootProject.service;
import com.example.SpringBootProject.NoSuchIdPresentException;
import com.example.SpringBootProject.entity.Brand_H;
import com.example.SpringBootProject.entity.Product_H;
import com.example.SpringBootProject.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
@Service
public class ServiceClass_H {
    @Autowired
    private CustomerRepository_H customerRepositoryH;
    @Autowired
    private ProductRepository_H productRepositoryH;
    @Autowired
    private EmpRepository_H empRepositoryH;
    @Autowired
    private BrandRepository_H brandRepositoryH;
    @Autowired
    private Prod2Repository_H prod2RepositoryH;
    Logger logger= LoggerFactory.getLogger(ServiceClass_H.class);
    public List<Product_H> getProdOfCustById(int id) {
        logger.info("entered getProdOfCustById() of service class");
        if (!customerRepositoryH.findById(id).isPresent()){
            throw new NoSuchIdPresentException("Customer with the id "+id+" is not present,pls give valid id");
        }
        else {
            return customerRepositoryH.findById(id).get().getProductList().stream().collect(Collectors.toList());
        }
    }
    public List<Brand_H> getProdOrderByBrand(int id) {
        logger.info("entered getProdOrderByBrand() of service class");
        try{
            return empRepositoryH.findById(id).get().getBrandList().stream().sorted(Comparator.comparing(Brand_H::getName)).collect(Collectors.toList());
        }
        catch (Exception e){
            throw new NoSuchIdPresentException("Employer with the id "+id+" is not present,pls give valid id");
        }
    }
    public Map<String, Integer> getProdCount(int id) {
        logger.info("entered getProdCount() of service class");
        if(!empRepositoryH.findById(id).isPresent()) {
            logger.error("Emp with the id "+id+" is not present,pls give valid id");
            throw new NoSuchIdPresentException("Emp with the id "+id+" is not present,pls give valid id");
        }
        else{
            return empRepositoryH.findById(id) .get().getBrandList().stream().collect(Collectors.toMap(Brand_H::getName, s -> s.getProduct2List().size()));
        }
  }
}



