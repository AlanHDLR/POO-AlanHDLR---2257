/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon;

/**
 *
 * @author Alan
 */
public class Persona {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String curp;
    
    public Persona(){     
}

public Persona (String nombre, String apPaterno, String apMaterno, int edad, String curp){
    this.nombre = nombre;
    this.apPaterno = apPaterno;
    this.apMaterno = apMaterno;
    this.edad = edad;
    this.curp = curp;
} 

    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurp() {
        return curp;
    }

    }

