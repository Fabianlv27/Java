/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocontadores2;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author CEEP
 */
public class EjercicioContadores2 {
    static Scanner dato= new Scanner(System.in);
    static int i;
    static int j;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        menu();
    }
   


public static void menu(){
    int option=-1;
    while(option!=0){
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
for(i=1;i<3;i++){
    System.out.println("");
}
}
  

}
public static void Ejercicio1(){
int num;
    System.out.println("Ingrese un numero");
    num= dato.nextInt();
    if (num==0){
        System.out.println("El numero es 0");
    }else if(num > 0){
        System.out.println("El numero es positivo");
    }else{
        System.out.println("El numero es negativo");
    }
}

public static void Ejercicio2(){
int num;
int Cpos=0;
int Cneg=0;
int CCero=0;
int T_sum=0;

    for (int i = 0; i < 5; i++) {
         System.out.println("Ingrese un numero");
    num= dato.nextInt();
    if (num==0){
        CCero++;
    }else if(num > 0){
        Cpos++;
    }else{
       Cneg++;
    }
    T_sum +=num;
        System.out.println("La suma es : " + T_sum);
    }
    System.out.println("Hay " + Cpos+" positivos");
    System.out.println("Hay " + Cneg+" negativos");
    System.out.println("Hay " + CCero+" ceros");

    
   
}
public static void Ejercicio3(){
int num;
    System.out.println("Ingrese un numero");
    num= dato.nextInt();
    for (int i = 1; i < 10; i++) {
        System.out.println(num + "* " + i + "="+ num*i);
    }
}
public static void Ejercicio4(){
    for (int i = 1; i <= 10; i++) {
         System.out.println("Tabla del " + i +":");
        for (int j = 1; j <= 9; j++) {
            System.out.println(i + "*" + j +"=" +i*j);
           
              
        }
 
    }
}
public static void Ejercicio5(){
    int T_Num=0;
    int C_Num=0;
    
    for (int i = 5; i <= 100; i+=5) {
     T_Num+= i;
     C_Num++;
    
    }
    System.out.println("La suma de los multiplos es: " + T_Num);
    System.out.println("La Cantidad de multiplos es: " + C_Num);

}
public static void Ejercicio6(){
    int num=0;
    
    for (int i = 0; i < 10; i++) {
        System.out.println("Introduce un numero del 1 al 50: ");
        num= dato.nextInt();
        System.out.println("El numero pertenece a la decena: "+ num/10);     
    
    }

}public static void Ejercicio7(){
    int edad=0;
    int max=-99;
    for (int i = 0; i < 5; i++) {
        System.out.println("Introduce la edad el alumno "+ i + ":");
        edad= dato.nextInt();
         if (edad > max) {
            max=edad;
        }
    }
            System.out.println("El mayor tiene: "+ max +"años");
}

public static void Ejercicio9(){
    int Suma=0;
    System.out.println("Introduce un numero: ");
    //utiliza el scan previamente declarado en la clase publica
    int NUM= dato.nextInt();
     Suma+=NUM;
  do{
    System.out.println("Introduce un numero: ");
    //utiliza el scan previamente declarado en la clase publica
    NUM= dato.nextInt();
    Suma+=NUM;
      System.out.println(Suma);
  }while(Suma < 1000);
    System.out.println("La suma a exedido a 1000");
}
public static void Ejercicio10(){
int Suma=0;
for(i=10;i<700;i+=2){
Suma +=i;
    System.out.println(i);
}
}
public static void Ejercicio11(){
    int T_NegNum=0;
    int C_NegNum=0;
}
public  static  void Ejercicio12(){
    
}
}

