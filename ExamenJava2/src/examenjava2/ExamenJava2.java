/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenjava2;

import java.util.Scanner;

/**
 *
 * @author CEEP
 */
public class ExamenJava2 {
   static  Scanner dato=new Scanner(System.in);
   static  int [][] TBNum=new int[5][6];
   
   public static int alea(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }
   public static void Cargar(){
       for (int i = 0; i < TBNum.length; i++) {
           for (int j = 0; j < TBNum[i].length; j++) {
                    TBNum[i][j]=alea(10, 99);
           }

           
           
       }
   }
        
    public static void Ejercicio1() {
        System.out.println("");
        System.out.println("=====Vizualizando Tabla Por filas=======");
        for (int i = 0; i < TBNum.length; i++) {
            for (int j = 0; j < TBNum[i].length; j++) {
                System.out.print(TBNum[i][j]+"\t");
                
            }
            System.out.println("");
        }
        System.out.println("");
         System.out.println("=====Vizualizando Tabla Por Columnas=======");
  for (int j = 0; j < TBNum[0].length; j++) {
            for (int i = 0; i < TBNum.length; i++) {
                System.out.print(TBNum[i][j]+"\t");
                
            }
            System.out.println("");
        }
    }
    
public static void Ejercicio2(){
    System.out.println("===Minimos===");
    System.out.println("");
    int Min=100;
    int pos=0;
 for (int j= 0; j< TBNum[0].length; j++) {
            for (int i = 0; i < TBNum.length; i++) {
                if (TBNum[i][j]<Min) {
                    Min=TBNum[i][j];
                    pos=i+1;
                }
                
            }
            System.out.println("El minimo de la columna " + (j+1)+ " es: " + Min);
            System.out.println("Y se ubica en la posicion: "+ pos);
            System.out.println("");
            Min=100;
            pos=0;
        }
} 
public static void Ordenar(){
        System.out.println("===Tabla Ordenada por la primera columna\n Vista por filas y columnas===");
    System.out.println("");
      int count=0; 
        for (boolean ordenado=false;!ordenado;){ 
                for (int j = 0; j < TBNum.length-1; j++){ 
          
                    if (TBNum[j][0]>TBNum[j+1][0]){

                    
                        
                                        for (int i= 0; i < 6; i++) {
                        int temp=TBNum[j][i];
                        TBNum[j][i]=TBNum[j+1][i];
                        TBNum[j+1][i]=temp;
                    }
                        count++;
                        
                    }
                }
             
                if (count==0){
                    ordenado=true;
                }
                count=0; 
        }
    


            System.out.println("");
           Ejercicio1();
        }

public static void Ejercicio4(){
    double TNum=0;
   for (int i = 0; i < TBNum[0].length; i++) {
            for (int j = 0; j < TBNum.length; j++) {
               TNum+=TBNum[j][i];
                
            }
          System.out.printf("la media de la fila %d es: %.2f ", i , TNum/6);
          System.out.println("");
          TNum=0;
        }
    
}
   public static void menu() {
        int option = -1;
        while (option != 0) {
            System.out.println("Menu");
            System.out.println("=====\n");
            System.out.println("\t (1) Ejercicio 1.-");
            System.out.println("\t (2) Ejercicio 2.-");
            System.out.println("\t (3) Ejercicio 3.-");
            System.out.println("\t (4) Ejercicio 4.-");
            System.out.println("\t (0) Salir");
            System.out.println("\n Seleccione la opcion elegida: ");
            option = dato.nextInt();
            switch (option) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                   Ordenar();
                    break;
                case 4:
                   Ejercicio4();
                    break;     
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            for (int i = 1; i < 3; i++) {
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Cargar();
        menu();
    }
    
}
