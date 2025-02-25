/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacolecciones;


public class Persona {
    private  String Nombre;
    private  String Apellido;
    private int edad;
    private String Genero;


    public Persona(String Nombre,String Apellido,int edad,String Genero){
        
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.edad=edad;
    this.Genero=Genero;
    
    
    }

  @Override
    public String toString() {
        return "{"
            + "\"Nombre\": \"" + Nombre + ",\n "
            + "\"Apellido\": \"" + Apellido + ",\n "
            + "\"edad\": " + edad + ", \n"
            + "\"Genero\": \"" + Genero + "\n"
            + "} \n";
    }
    
}
