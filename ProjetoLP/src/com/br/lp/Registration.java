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
public class Registration {
    private Student student;
    private Course course;
    private int acadYear;
    private int semester;

    public Registration(Student student, Course course, int acadYear, int semester) {
        this.student = student;
        this.course = course;
        this.acadYear = acadYear;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAcadYear() {
        return acadYear;
    }

    public void setAcadYear(int acadYear) {
        this.acadYear = acadYear;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    
}
