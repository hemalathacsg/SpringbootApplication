package com.example.SpringBootProject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="employee")
public class Employee_H {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String date_of_birth;
    private long salary;
    private int isd_code;
    @Column(unique = true)
    private long mobile_contact;
    @Column(unique = true)
    private String email;
    private int dept_id;
    @OneToMany(mappedBy = "emp")
    List<Brand_H> brandList;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getIsd_code() {
        return isd_code;
    }

    public void setIsd_code(int isd_code) {
        this.isd_code = isd_code;
    }

    public long getMobile_contact() {
        return mobile_contact;
    }

    public void setMobile_contact(long mobile_contact) {
        this.mobile_contact = mobile_contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public List<Brand_H> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<Brand_H> brandList) {
        this.brandList = brandList;
    }
}
