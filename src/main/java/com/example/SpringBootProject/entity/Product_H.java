package com.example.SpringBootProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product_H {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pname;
    private int quantity;
    private double unit_price;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "customer_id")
    private Customerr_H cust;

    public Customerr_H getCust() {
        return cust;
    }

    public void setCust(Customerr_H cust) {
        this.cust = cust;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
}
