package com.example.SpringBootProject.controller;
import com.example.SpringBootProject.entity.Brand_H;
import com.example.SpringBootProject.entity.Product_H;
import com.example.SpringBootProject.service.ServiceClass_H;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
@RestController
public class Controller_H {
    @Autowired
    private ServiceClass_H cs;
    @Autowired
    private ServiceClass_H ebp;
    Logger logger=LoggerFactory.getLogger(Controller_H.class);
    @GetMapping("/getProdOfCustById/{id}")
    public List<Product_H> getProducts(@PathVariable int id) throws Exception {
        logger.info("getProdOfCustById of controller is started");
            return (List<Product_H>) cs.getProdOfCustById(id);
    }
    @GetMapping("/getProdOrderByBrand/{id}")
    public List<Brand_H> getBrandProducts(@PathVariable int id){
        logger.info("getProdOrderByBrand of controller is started");
        return ebp.getProdOrderByBrand(id);

    }
   @GetMapping("/getProdCountByEmpId/{id}")
    public Map<String,Integer> getProdCounts(@PathVariable int id){
       logger.info("getProdCountByEmpId of controller is started");
       return ebp.getProdCount(id);
    }

}

