/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author CEEP
 */
public class JavaApplication2 {

    static Scanner dato = new Scanner(System.in);

    public static int Randomizer(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }

    public static void main(String[] args) {
        menu();
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
            System.out.println("\t (5) Ejercicio 5.-");
            System.out.println("\t (6) Ejercicio 6.-");
            System.out.println("\t (7) Ejercicio 7.-");
            System.out.println("\t (8) Ejercicio 8.-");
            System.out.println("\t (0) Salir");
            System.out.println("\n Seleccione la opcion elegida: ");
            option = dato.nextInt();
            switch (option) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2(5);
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    //Ejercicio5();
                    break;
                case 6:
                    //Ejercicio6();
                    break;
                case 7:
                    //Ejercicio7();
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
            for (int i = 1; i < 3; i++) {
                System.out.println("");
            }
        }
    }

    public static void Ejercicio1() {
        int[] TB_Num = new int[100];
        double T_Par = 0;
        double T_Impar = 0;
        int C_Par = 0;
        int C_Impar = 0;

        for (int i = 0; i < TB_Num.length; i++) {
            TB_Num[i] = Randomizer(1, 99);
            System.out.println(TB_Num[i]);
        }
        Maximos(TB_Num);
        Minimos(TB_Num);

        for (int i = 0; i < TB_Num.length; i++) {
            if (i % 2 == 0) {
                C_Par++;
                T_Par += TB_Num[i];

            } else {
                C_Impar++;
                T_Impar += TB_Num[i];
            }

        }
        System.out.println("la media de Pares es = " + T_Par / C_Par);
        System.out.println("la media de Impares es = " + T_Impar / C_Impar);
    }

    public static void Ejercicio2(int Cantidad) {
        int num;
        int A = 0;
        int D = 0;
        int Notas = 0;
        System.out.println("Hola");
        for (int i = 0; i < Cantidad; i++) {
            System.out.println("Ingrese la nota");
            num = dato.nextInt();
            if (num >= 5) {
                A++;
            } else {
                D++;
            }
            Notas += num;
        }
        System.out.println(" Aprobados: " + A);
        System.out.println("Desaprobados: " + D);
        System.out.println("La media de las notas de la clase:" + Notas / Cantidad);
    }

    public static void Ejercicio3() 
    
    {
        int[][] TB_A = new int[15][10];
        int[][] TB_B = new int[15][10];
        int[][] TB_R = new int[15][10];
        int[][] TB_S = new int[15][10];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                TB_A[i][j] = Randomizer(10, 20);
                TB_B[i][j] = Randomizer(10, 20);
            }

        }
        System.out.println("Array A");
        for (int i = 0; i < 15; i++) {
            
            for (int j = 0; j < 10; j++) {
                System.out.print(TB_A[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Array B");

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(TB_B[i][j] + "\t");
            }
                        System.out.print("\n");

        }
//Suma
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                TB_S[i][j] = TB_A[i][j] + TB_B[i][j];
                TB_R[i][j] = TB_A[i][j] - TB_B[i][j];

            }

        }
        
         System.out.println("Array Suma");

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(TB_S[i][j] + "\t");
            }
                        System.out.print("\n");

        }
         System.out.println("Array Resta");

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(TB_R[i][j] + "\t");
            }
                        System.out.print("\n");

        }
       

    }
public static void Ejercicio4(){
    int T_NotasAlumno=0;
    int T_NotasCurso=0;
    int[][] TB_Notas= new int[15][10];
    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 10; j++) {
            TB_Notas[i][j]=Randomizer(0,5);
            
        }
    }
    System.out.println("Tabla Notas:");
    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.print(TB_Notas[i][j] +"\t");
            
        }
        System.out.println("\n");
    }
    System.out.println("Media Alumnos");
    for (int i = 0; i < 15; i++) {
        T_NotasAlumno=0;
        for (int j = 0; j < 10; j++) {
           T_NotasAlumno+=TB_Notas[i][j];
           
        }
         System.out.println("La media del Alumno "+(i+1)+"es:"+(T_NotasAlumno)/15 );
    }
    System.out.println("Media Notas");
    
    for (int j = 0; j < 10; j++) {
                T_NotasCurso=0;
        for (int i = 0; i < 15; i++) {
           T_NotasCurso+=TB_Notas[i][j];
        
        }
           System.out.println("La media del Curso "+(j+1)+"es:"+(T_NotasCurso)/10 ); 
    }
    
    
}
public static void Ejercicio5(){
    int[][] TB_Num=new int[10][15];
    int[] TB_Tot=new int[15];
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 15; j++) {
            TB_Num[i][j]=Randomizer(1,10);
            
            
        }
    }
}
    public static void Maximos(int Tb[]) {
        int Max = -99;
        for (int i = 0; i < Tb.length; i++) {
            if (Tb[i] > Max) {
                Max = Tb[i];
            }

        }
        System.out.println("Max = " + Max);
    }

    public static void Minimos(int Tb[]) {
        int Min = 9999;
        for (int i = 0; i < Tb.length; i++) {
            if (Tb[i] < Min) {
                Min = Tb[i];
            }

        }
        System.out.println("Min = " + Min);
    }

}
