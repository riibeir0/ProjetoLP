/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp;

import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Course {
    private String code;
    private String title;
    private int numCredits;
    private int maxStudents;

    public Course(String code, String title, int numCredits, int maxStudents) {
        this.code = code;
        this.title = title;
        this.numCredits = numCredits;
        this.maxStudents = maxStudents;
    }
    
    public Course(String nome){
        this.title = nome;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", title=" + title + ", numCredits=" + numCredits + ", maxStudents=" + maxStudents + '}';
    }
    
    
    
}
