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
public class University {

    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Registration> registrations;

    public University(String name) {
        this.name = name;
    }
    
    public Course addCourse(String code, String title, int numCredits, int maxStudents) throws Exception{
        Course a = new Course(code, title, numCredits, maxStudents);
        for (Course cursoExistente : courses) { //compara o curso com o existente
            if(a.getTitle().equals(cursoExistente.getTitle())){
                throw new Exception("Curso já existe!");
            } else{
                courses.add(a);
            }
        } return a; 
    } 
    
    public ArrayList<Course> updateCourse(String code, String title, int numCredits, int maxStudents) throws Exception{
        boolean flag = false;
        for (Course course : courses) {
            if(course.getTitle().equals(title)){
                course.setCode(code);
                course.setMaxStudents(maxStudents);
                course.setNumCredits(numCredits);
                flag = true;
            }
        }
       
        return courses ;
    } 
    
    public Student UnderGraduateStudent (Long id, String name, String address, String phone, String email, String major, String minor) {
        Student a = new Student(code, title, numCredits, maxStudents);
        for (Student alunoUnderExistente : students) { //compara os estudantes com o existente
            if(a.getTitle().equals(cursoExistente.getTitle())){
                throw new Exception("Curso já existe!");
            } else{
                courses.add(a);
            }
        } return a; 
    }
    
} //fim da classe university

