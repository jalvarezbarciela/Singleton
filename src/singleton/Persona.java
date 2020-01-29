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
public class Persona {
    private static int edad;
    private static String nome;
    private static String apellido;
    private static Persona launica;

    private Persona(int edad, String nome, String Apelido) {
        launica.edad = edad;
        launica.nome = nome;
        launica.apellido = Apelido;
    }

    public static Persona getInstance(int edad,String nome, String Apelido){
        if(launica==null){
        launica=new Persona(edad,nome,Apelido);    
        }
        
        return launica;         
    }

    @Override
    public String toString() {
        return "Persona:" + "edad=" + edad + ", nome=" + nome + ", Apellido=" + apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        launica.edad = edad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        launica.nome = nome;
    }

    public String getApelido() {
        return apellido;
    }

    public void setApelido(String Apelido) {
        launica.apellido = Apelido;
    }

    
}
