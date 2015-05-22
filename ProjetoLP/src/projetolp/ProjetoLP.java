/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp;

import com.br.lp.PostGraduateStudent;
import com.br.lp.Student;
import com.br.lp.University;

/**
 *
 * @author 31462669
 */
public class ProjetoLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Long b = 31448471l;
        Student a = new Student(b, "Gabriel", "Rua dos bobos N°0", "666", "gabriel@gmail.com");
        Student c = new Student(b, "Paulo", "Rua dos bobos N°0", "666", "gabriel@gmail.com");
        
        System.out.println(a.toString());
        System.out.println(c.toString());
        
        Student alunopos = new PostGraduateStudent (41331467l, "Renata", "Rua da salvação", "43111779", "renatacantarin@hotmail.com", "The Maine", "Gabriel");
        System.out.println(alunopos.toString());
        /*
        a.setId(31462669l);
        System.out.println(a.getId());
        
        a.setAddress("Rua dos macacos selvagens");
        a.setEmail("gabrielrdardengo@hotmail.com");
        a.setPhone("36816766"); */  
        
    }
    
}
