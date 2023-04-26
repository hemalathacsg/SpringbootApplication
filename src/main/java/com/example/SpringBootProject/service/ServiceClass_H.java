package com.example.SpringBootProject.service;
import com.example.SpringBootProject.NoSuchIdPresentException;
import com.example.SpringBootProject.entity.Brand_H;
import com.example.SpringBootProject.entity.Dummy2;
import com.example.SpringBootProject.entity.DummyData;
import com.example.SpringBootProject.entity.Product_H;
import com.example.SpringBootProject.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    @Autowired
    private Dummy2Repository dummy2Repository;
    @Autowired
            private DummyRepo dummyRepo;
    public List<DummyData> getAllEmpList(){
        return dummyRepo.findAll();
//      return StreamSupport.stream(dummyRepo.findAll().spliterator(), false)
//              .collect(Collectors.toList());
    }
    public void deleteEmp(int id){
        dummyRepo.deleteById(id);
    }
    public DummyData addEmp(DummyData emp){
        return dummyRepo.save(emp);
    }
    public DummyData updateEmp(int id,DummyData emp){
        DummyData empToUpdate = dummyRepo.findById(id).get();
        empToUpdate.setEmpname(emp.getEmpname());
        empToUpdate.setLocation(emp.getLocation());
        empToUpdate.setMobileno(emp.getMobileno());
        empToUpdate.setDesignation(emp.getDesignation());
        return dummyRepo.save(empToUpdate);
    }

    Logger logger= LoggerFactory.getLogger(ServiceClass_H.class);
    public List<Product_H> getProdOfCustById(int id) {
//        logger.info("entered getProdOfCustById() of service class");
        if (!customerRepositoryH.findById(id).isPresent()){
            throw new NoSuchIdPresentException("Customer with the id "+id+" is not present,pls give valid id");
        }
        else {
            return customerRepositoryH.findById(id).get().getProductList().stream().collect(Collectors.toList());
        }
    }
    public List<Brand_H> getProdOrderByBrand(int id) {
//        logger.info("entered getProdOrderByBrand() of service class");
        try{
            return empRepositoryH.findById(id).get().getBrandList().stream().sorted(Comparator.comparing(Brand_H::getName)).collect(Collectors.toList());
        }
        catch (Exception e){
            throw new NoSuchIdPresentException("Employer with the id "+id+" is not present,pls give valid id");
        }
    }
    public Map<String, Integer> getProdCount(int id) {
//        logger.info("entered getProdCount() of service class");
        if(!empRepositoryH.findById(id).isPresent()) {
            logger.error("Emp with the id "+id+" is not present,pls give valid id");
            throw new NoSuchIdPresentException("Emp with the id "+id+" is not present,pls give valid id");
        }
        else{
            return empRepositoryH.findById(id) .get().getBrandList().stream().collect(Collectors.toMap(Brand_H::getName, s -> s.getProduct2List().size()));
        }
  }
  //get dummy2 data
  public List<Dummy2> getDummy2Data(){
        return dummy2Repository.findAll();
  }
    //update dummy2 data
    public Dummy2 updateDummy2Data(int id,Dummy2 user){
        Dummy2 usertoUpdate=dummy2Repository.findById(id).get();
        usertoUpdate.setName(user.getName());
        return dummy2Repository.save(usertoUpdate);
    }

    //delete dummy2 data
    public void deleteDummy2Data(int id){
         dummy2Repository.deleteById(id);
    }

    //add dummy2 data
    public Dummy2 addDummy2Data(Dummy2 user){
        return dummy2Repository.save(user);
    }
}



