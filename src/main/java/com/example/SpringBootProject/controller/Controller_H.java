package com.example.SpringBootProject.controller;
import com.example.SpringBootProject.entity.Brand_H;
import com.example.SpringBootProject.entity.Dummy2;
import com.example.SpringBootProject.entity.DummyData;
import com.example.SpringBootProject.entity.Product_H;
import com.example.SpringBootProject.service.ServiceClass_H;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins = "http://127.0.0.1:5500", allowCredentials = "true")
public class Controller_H {
    @Autowired
    private ServiceClass_H cs;
    @Autowired
    private ServiceClass_H ebp;
    Logger logger=LoggerFactory.getLogger(Controller_H.class);
    @GetMapping("/getAllEmpList")
    public List<DummyData> getAllEmpList(){
        return cs.getAllEmpList();
    }
    @GetMapping("/getProdOfCustById/{id}")
    public List<Product_H> getProducts(@PathVariable int id) throws Exception {
//        logger.info("getProdOfCustById of controller is started");
            return (List<Product_H>) cs.getProdOfCustById(id);
    }
    @GetMapping("/getProdOrderByBrand/{id}")
    public List<Brand_H> getBrandProducts(@PathVariable int id){
//        logger.info("getProdOrderByBrand of controller is started");
        return ebp.getProdOrderByBrand(id);
    }
   @GetMapping("/getProdCountByEmpId/{id}")
    public Map<String,Integer> getProdCounts(@PathVariable int id){
//       logger.info("getProdCountByEmpId of controller is started");
       return ebp.getProdCount(id);
    }
@DeleteMapping("/deleteEmp/{id}")
    public void deleteEmp(@PathVariable int id){
        cs.deleteEmp(id);
    }

    @PutMapping("/updateEmp/{id}")
    public DummyData updateEmp(@PathVariable int id,@RequestBody DummyData emp){
        return cs.updateEmp(id, emp);
    }
    @PostMapping("/addEmp")
    public DummyData addEmp(@RequestBody  DummyData emp){
        return cs.addEmp(emp);
    }


    ///perfomring some dummy oeprtaions for practise
    @GetMapping("/getDummy2Data")
    public List<Dummy2> getDummy2Data(){
        return cs.getDummy2Data();
    }
    @PostMapping("/addDummy2Data")
    public Dummy2 addDummy2Data(@RequestBody Dummy2 user){
        return cs.addDummy2Data(user);
    }
    @DeleteMapping("/deleteDummy2Data/{id}")
    public void deleteDummy2Data(@PathVariable int id){
        cs.deleteDummy2Data(id);
    }

    @PutMapping("/updateDummy2Data/{id}")
    public Dummy2 updateDummy2Data(@PathVariable int id, @RequestBody Dummy2 user){
        return cs.updateDummy2Data(id, user);
    }


}

