/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import Persona.Persona;
import Persona.Alumno;

/**
 *
 * @author AlanHDLR
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Alumno a1 = new Alumno();
        a1.setNombre("Alan Higuera de la Rosa");
        a1.setEdad(19);
        //1 = Hombre, 2 = Mujer
        a1.setGenero(1);
        a1.setAltura(1.73f);
        
        a1.setNumeroCuenta("318153474");
        a1.setCarrera("Ing.enComputación");
        a1.setSemestre(2);
        
        Alumno a2 = new Alumno("123484759","Economia",7,"Juan Pablo Hernandez",21,1,1.86f);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
// TODO code application logic here
    }
    
}
