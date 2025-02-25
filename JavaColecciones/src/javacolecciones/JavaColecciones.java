/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacolecciones;
import java.util.LinkedList;
import java.util.Arrays;
/**
 *
 * @author CEEP
 */
public class JavaColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Object> Lista=new LinkedList<>();
        
        Lista.add(new Persona("Fabian", "Luna", 18, "Masculino"));
        Lista.add(new Persona("Leonardo", "Paredez", 18, "Masculino"));
        
        System.out.println(Lista);
        
    }


}
