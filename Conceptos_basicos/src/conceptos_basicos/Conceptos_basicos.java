/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos_basicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Alan
 */
public class Conceptos_basicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho= new Automovil();
        //miBocho.marca="
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println( miBocho );
       
        Automovil miAcura= new Automovil();
        miAcura.setMarca("Honda");
        miAcura.setSubMarca("Acura");
        miAcura.setModelo(2000);
        miAcura.setColor(Color.yellow);
        System.out.println ( miAcura );
        
        Automovil miMustang= new Automovil();
        miMustang.setMarca("Ford Motor Company");
        miMustang.setSubMarca("Mustang");
        miMustang.setModelo(2015);
        miMustang.setColor(Color.black);
        System.out.println( miMustang);
        
    }
    
}
