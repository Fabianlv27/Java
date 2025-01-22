/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysconobjetos;
//Crear dos arrays de 10 elementos c/u , el primero : nombres, segundo:notas, cositas: 
    //1-Un listado con los nombres y notas de los alumnos
    //2-Ver el listado ordenado por nombres
    //3.-Otro listado ordenado de manera descendente por las notas
    //4-Copa de solo aprobados y solo suspensos
    //5.-Metodo que me permita insertar ,eliminar y editar el alumno y/o nota
    //6.-Generar una clase con el resultado final, con dos atributos : nombre y nota en donde creemos los objetos del array que tengamos
    

/**
 *
 * @author CEEP
 */
public class ArraysConObjetos {

    /**
     * @param args the command line arguments
     */
      public static int alea(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }
    public static void Ejercicio1() {
      String[] Nombres=new String[] {"Messi","Ronaldo","Neymar","Yamal","Vinicius","Harry","Son","Gavi","Vidal","Suarez"};
      int[] Notas=new int[10] ;
      
        for (int i = 0; i <Notas.length; i++) {
            Notas[i]=alea(0, 9);
        }
        
        for (int i = 0; i < Notas.length; i++) {
            System.out.print("Alumno: " + Nombres[i]);
            System.out.print("\t Nota: " + Notas[i]+"\n");
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1();
        
    }
    
}
