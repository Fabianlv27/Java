/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesjava;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author CEEP
 */
public class ClasesJava {

    /**
     * @param args the command line arguments
     */
    
    //Generar 3 Personas y meterlos en un array y decir cuantos estan jubilados
    public static void Ejercicio(){
       Persona[] Personas= new Persona[3];
int C_Jub=0;
       Personas[0]=new Persona("jose","martines","hombre",24);
       Personas[1]=new Persona("Mariana","Caseres","Mujer",99);
       Personas[2]=new Persona("Osvaldo","Vicente","hombre",9);
        System.out.println(Arrays.toString(Personas));
        for (int i = 0; i < Personas.length; i++) {
           if(Personas[i].isJubilar())
            C_Jub++;
        }
        System.out.println("Hay " + C_Jub + " Jubilados");
    } 
    public static void main(String[] args) {
        //Ejercicio();
        Ejemplo();
    }
public static  void Ejemplo(){
    System.out.println("Ejemplo Clases");
Persona p1=new Persona("Jose","Olaya","hombre",25);
p1.Gustos="fdfdgfgfg";

    System.out.println(p1);

      // System.out.println(p1);
      //  System.out.println("El nombre de p1 es:" + p1.getNombre());
      //  Persona p6 = new Persona("Dixon", "Mayas");
        //System.out.println(p6);
       // System.out.println(p6.getNombre() + "  " + p6.getApellido());
       // Persona p7 = new Persona("Juan", "Alberto", "Trans", 18);
       // System.out.println(p7.isJubilar());
       // Persona p8 = new Persona("Mariano", "Alberto", "Helicoptero", 68);
       //System.out.println(p8);
}
    
}
