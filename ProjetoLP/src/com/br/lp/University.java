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
public class University { //problema no 

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
    
    public Course updateCourse(String code, String title, int numCredits, int maxStudents) throws Exception{
        boolean flag = false;
        Course curso = null;
        for (int i = 0; i < courses.size(); i++) {
            if(curso.getTitle().equals(title)){
                curso.setCode(code);
                curso.setMaxStudents(maxStudents);
                curso.setNumCredits(numCredits);
                flag = true;
            } else
            throw new Exception ("Curso não existe!");
        }
        
        return curso;
    } 
    
    public UnderGraduateStudent addUnderGraduateStudent (Long id, String name, String address, String phone, String email, Course curso, String major, String minor) throws Exception {
        UnderGraduateStudent a = new UnderGraduateStudent(id, name, address, phone, email, curso, major, minor);
            for (Student alunoEx : students){ //aluno existente
                if(a.getId().equals(alunoEx.getId())){
                    throw new Exception("ALuno já existe");
                } else{
                    students.add(a);
                }
            }
        return a; 
    }
    
    public UnderGraduateStudent updateUnderGraduateStudent (Long id, String name, String address, String phone, String email, String major, String minor)throws Exception {
        boolean flag = false;
        UnderGraduateStudent estudante = null;
        for (int i = 0; i < students.size(); i++) {
            if(estudante.getId().equals(id)){
                estudante.setId(id);
                estudante.setName(name);
                estudante.setAddress(address);
                estudante.setPhone(phone);
                estudante.setEmail(email);
                estudante.setMajor(major);
                estudante.setMinor(minor);
                flag = true;
            } else
            throw new Exception ("Estudante não existe!");
        }
        
        return estudante;  
    }
    
    public PostGraduateStudent addPostGraduateStudent (Long id, String name, String address, String phone, String email, Course curso, String thesisTitle, String supervisor) throws Exception {
        PostGraduateStudent a = new PostGraduateStudent(id, name, address, phone, email,curso, thesisTitle, supervisor);
            for (Student alunoEx : students){ //aluno existente
                if(a.getId().equals(alunoEx.getId())){
                    throw new Exception("ALuno já existe");
                } else{
                    students.add(a);
                }
            }
        return a; 
    }
    
    public PostGraduateStudent updatePostGraduateStudent (Long id, String name, String address, String phone, String email, String ThesisTitle, String supervisor)throws Exception {
        boolean flag = false;
        PostGraduateStudent estudante = null;
        for (int i = 0; i < students.size(); i++) {
            if(estudante.getId().equals(id)){
                estudante.setId(id);
                estudante.setName(name);
                estudante.setAddress(address);
                estudante.setPhone(phone);
                estudante.setEmail(email);
                estudante.setThesisTitle(ThesisTitle);
                estudante.setSupervisor(supervisor);
                flag = true;
            } else
            throw new Exception ("Estudante não existe!");
        }
        
        return estudante;  
    }
    
    public Course getCourse(String code)throws Exception {
        Course curso = null;
        
        for(int i = 0; i < courses.size(); i++) {
            if(code.equals(courses.get(i).getCode())){
                curso = courses.get(i);  
            } else
                throw new Exception("Esse curso não existe!");
        }
        return curso;
    }
    
    public Student getStudent(Long id)throws Exception {
        Student estudante = null;
        
        for(int i = 0; i < students.size(); i++){
            if(id.equals(students.get(i).getId())){
                estudante = students.get(i);
            }
        }
        return estudante;
    }
    
    
    public Course getCourses(Long studentId)throws Exception { 
        Course curso = null;
        for (Student student : students) {
            if(student.getId() == studentId){
                curso = student.getCursos();
            }
        }
        return curso;
    }
    
   

} //fim da classe university

