/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistejemplo2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * //clase vehiculo:
 * matricula (4nums,3 letras),marca, modelo,año de matriculacion,numero de reparacion.
 * estamos en un taller y queremos saber las reparaciones que tienen los coches,
 * se requiere:
 * cuando entra un coche a reparar tenemos que meter: todo menos la reparacion(automatico)
 * si hay iguales, contar cuantos hay y sumarle 1 al numero de reparacion.
 * 
 * 
 * @author CEEP
 */
public class ArrayListEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList();
       
        numbers.add(6);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
         Iterator <Integer> itr=numbers.iterator();       
        while (itr.hasNext()) {
            System.out.println("Numero: "+ itr.next());
            
        }
        
        
        
        
    }
    
}
