package com.example.SpringBootProject.entity;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name="customer")
public class Customerr_H {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String country;
    private String date_of_birth;
    private String email;
    private  String isd_code;
    private String mobile_contact;
    private String state;
    private String zipcode;
    @OneToMany(mappedBy = "cust")
    private List<Product_H> productList;
    public List<Product_H> getProductList() {
        return productList;
    }
    public void setProductList(List<Product_H> productList) {
        this.productList = productList;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getDate_of_birth() {
        return date_of_birth;
    }
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIsd_code() {
        return isd_code;
    }
    public void setIsd_code(String isd_code) {
        this.isd_code = isd_code;
    }
    public String getMobile_contact() {
        return mobile_contact;
    }
    public void setMobile_contact(String mobile_contact) {
        this.mobile_contact = mobile_contact;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
