/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;
/**
 *
 * @author ceque
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona miPersona;
        miPersona = Persona.getInstance(5,"Luis","Alll");
        System.out.println(miPersona.toString());
        Persona miPersona1;
        miPersona1 = Persona.getInstance(5,"Luis","A2");
        System.out.println(miPersona1.toString());             
        System.out.println(miPersona.toString());
    }   
}
