package com.example.SpringBootProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="product2")
public class Product2_H {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand_H brand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Brand_H getBrand() {
        return brand;
    }

    public void setBrand(Brand_H brand) {
        this.brand = brand;
    }
}
