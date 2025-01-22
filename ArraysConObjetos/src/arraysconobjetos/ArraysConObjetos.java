/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysconobjetos;
//Crear dos arrays de 10 elementos c/u , el primero : nombres, segundo:notas, cositas: 
//1-Un listado con los nombres y notas de los alum

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

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
    static Scanner dato=new Scanner(System.in);
    /**;
     * @param args the command line arguments
     */
    public static int alea(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }

    public static void Vizualizar(int[] Array1, String[] Array2) {
        for (int i = 0; i < Array1.length; i++) {
            System.out.print("Alumno: " + Array2[i]);
            System.out.print("\t Nota: " + Array1[i] + "\n");
        }

    }

  public static void InsertarElemento(String[] Arr1,int[] Arr2){
      String Nombre="A";
      int Numero=0;
      System.out.println("Insertar un Nombre");
      Nombre=dato.next();
      System.out.println("Insertar un Numero");
      Numero=dato.nextInt();
      //Nombre
      String[] NewNombreArr=new String[Arr1.length+1];
      System.arraycopy(Arr1, 0,NewNombreArr , 0, Arr1.length);
      //Notas
      int[] NewNotasArr=new int[Arr2.length+1];
      System.arraycopy(Arr2, 0,NewNotasArr , 0, Arr2.length);
      //Añadir Elemento
      NewNombreArr[NewNombreArr.length-1]=Nombre;
      NewNotasArr[NewNotasArr.length-1]=Numero;
      
     //Vizualizar
      System.out.println("Array con nuevo nombre: "+ Arrays.toString(NewNombreArr) );
      System.out.println("Array con notas nombre: "+ Arrays.toString(NewNotasArr));
     
      
      
  }
  public static void EliminarElemento(String[] Arr1,int[] Arr2){
      int Numero=0;
        System.out.println("Insertar la Posicion del alumno a eliminar");
      Numero=dato.nextInt();
      String[] NewNombres=new String[Arr1.length-1];
      System.arraycopy(Arr1, 0,NewNombres , 0, Numero);
     System.arraycopy(Arr1, Numero +1, NewNombres, Numero, Arr1.length-Numero-1);
      System.out.println("Nuevo Array: "+ Arrays.toString(NewNombres));
     
  }
  public static void Editar(String[]Arr1){
        int Numero;
        String Nombre;
        System.out.println("Insertar la Posicion del alumno a editar");
      Numero=dato.nextInt();
       System.out.println("Insertar un nuevo Nombre");
      Nombre=dato.next();
      Arr1[Numero]=Nombre;
      System.out.println("Nuevo Array: "+ Arrays.toString(Arr1));
  }
    public static void Ejercicio1() {
        String[] Nombres = new String[]{"Messi", "Ronaldo", "Neymar", "Yamal", "Vinicius", "Harry", "Son", "Gavi", "Vidal", "Suarez"};
        int[] Notas = new int[10];

        for (int i = 0; i < Notas.length; i++) {
            Notas[i] = alea(0, 9);
        }

        Vizualizar(Notas, Nombres);
        System.out.println("///////Nombres Ordenados :");
        Arrays.sort(Nombres);
        Vizualizar(Notas, Nombres);
        System.out.println("///////NotasOrdenadas Descendentemente :");
        Arrays.sort(Notas);
        for (int i = Notas.length - 1; i > 0; i--) {
            System.out.print("Alumno: " + Nombres[i]);
            System.out.print("\t Nota: " + Notas[i] + "\n");
        }
        System.out.println("///Copia de solo aprobados");
        int C_Aprobados=0;
        int C_Desaprobados=0;
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] >=5) {
                C_Aprobados++;
            }else{
                C_Desaprobados++;
            }
            
        }
        
        int[] AprOnly=new int[C_Aprobados];
        int[] DesOnly=new int[C_Desaprobados];
        int CAprPos=0;
        int CDesPos=0;
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i]>=5) {
                AprOnly[CAprPos]=Notas[i];
                CAprPos++;
            }
            else{
                DesOnly[CDesPos]=Notas[i];  
                CDesPos++;
            }
            
            
        }
        
        
        System.out.println("Aprobados");
        Vizualizar(AprOnly, Nombres);
        System.out.println("Desaprobados");
        Vizualizar(DesOnly, Nombres);
        //AprobadosOnly
        //  Vizualizar(Notas, Nombres);
        //InsertarElemento(Nombres, Notas);
        //EliminarElemento(Nombres, Notas);
        Editar(Nombres);
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1();

    }

}
