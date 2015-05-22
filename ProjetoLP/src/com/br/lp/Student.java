/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp;

import java.util.ArrayList;

/**
 *
 * @author 31462669
 */
public class Student {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private Course cursos;

    public Student(Long id, String name, String address, String phone, String email, Course curso) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.cursos = curso;
    }

    

    
    public Student() {

    }

    /*
     public boolean equals(Object obj){
        
     }
     */
    public Long getId() {
        return this.id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Nome) {
        this.name = Nome;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCursos() {
        return cursos;
    }

    public void setCursos(Course cursos) {
        this.cursos = cursos;
    }
    
    
    @Override
    public String toString() {
        return "ID = " + id + "\n Name = " + name + "\n Address = " + address + "\n Phone = " + phone + "\n Email = " + email;     
    
    }

}
