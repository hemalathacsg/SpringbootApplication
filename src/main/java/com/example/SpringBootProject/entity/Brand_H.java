package com.example.SpringBootProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="brand")
public class Brand_H {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee_H emp;
    @OneToMany(mappedBy = "brand")
    private List<Product2_H> product2HList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee_H getEmp() {
        return emp;
    }

    public void setEmp(Employee_H emp) {
        this.emp = emp;
    }

    public List<Product2_H> getProduct2List() {
        return product2HList;
    }

    public void setProduct2List(List<Product2_H> product2HList) {
        this.product2HList = product2HList;
    }


}
