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
public class PostGraduateStudent extends Student{
    private String thesisTitle;
    private String supervisor;
    
    public PostGraduateStudent(Long id, String name, String address, String phone, String email, String thesisTitle, String supervisor) {
        super(id, name, address, phone, email);
        this.thesisTitle = thesisTitle;
        this.supervisor = supervisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    
}
