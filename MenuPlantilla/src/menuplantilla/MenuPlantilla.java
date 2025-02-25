/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuplantilla;

import java.util.Scanner;

public class MenuPlantilla {
        static Scanner dato= new Scanner(System.in);

 public static void Ejercicio1(){
 
 }
   public static void Ejercicio2(){
 
 }
    public static void Ejercicio3(){
 
 }
     public static void Ejercicio4(){
 
 } public static void Ejercicio5(){
 
 } public static void Ejercicio6(){
 
 }
 public static void Ejercicio7(){
 
 }
 
     
public static void menu(){
    int option=-1;
    while(option!=0){
        System.out.println("=========");
        System.out.println(" Examen ");
        System.out.println("=========");
        System.out.println(">Hecho por: Fabian Luna");
        System.out.println("\t (1) Ejercicio 1.-");
        System.out.println("\t (2) Ejercicio 2.-");
        System.out.println("\t (3) Ejercicio 3.-");
        System.out.println("\t (4) Ejercicio 4.-");
        System.out.println("\t (5) Ejercicio 5.-");
        System.out.println("\t (6) Ejercicio 6.-");
        System.out.println("\t (7) Ejercicio 7.-");
        System.out.println("\t (8) Ejercicio 8.-");
        System.out.println("\t (0) Salir");
        System.out.println("\n Seleccione la opcion elegida: ");
        option=dato.nextInt();
switch(option) {
    case 1:
        Ejercicio1();
        break;
    case 2:
        Ejercicio2();
        break;
    case 3:
        Ejercicio3();
        break;
    case 4:
        Ejercicio4();
        break;
    case 5:
        Ejercicio5();
        break;
    case 6:
        Ejercicio6();
        break;
    case 7:
       Ejercicio7();
        break;
    case 8:
        //ejercicio8();
        break;
    case 0:
        break;
    default:
        System.out.println("Opción no válida.");
        break;
}
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        
    }
    

}