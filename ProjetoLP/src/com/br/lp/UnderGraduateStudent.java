/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp;

/**
 *
 * @author Gabriel
 */
public class UnderGraduateStudent extends Student{
    private String major;
    private String minor;
    
    public UnderGraduateStudent(Long id, String name, String address, String phone, String email, String major, String minor) {
        super (id, name, address, phone, email);
        this.major = major;
        this.minor = minor;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public String toString() {
        return super.toString()+"\nmajor=" + major + "\nminor=" + minor + '}';
    }
    
    
}
