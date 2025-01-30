/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringejercicio1;
//Introducir dos cadenas de texto,se pide:introdicir una palabra e indicar cuantas veces aparece en la primera cadena,
//2.-Mostrar los caracteres impares de la primera cadena

import java.util.Scanner;

//3.-Que cadena tiene mas palabras.
//4.-Indicar alfabeticamente cual es la primera cadena
//5.-Poner en la segunda cadena las plabras impares en mayuscula.
//Poner la primera letra de cada palabra en mayuscula

//Meter el numero de DNI y comprobar si la letra esta bien, divider los numeros entre 23 y el resto lo comparamos con una tabla que esta en internet.

/**
 *
 * @author CEEP
 */
public class StringEjercicio1 {
static Scanner dato=new Scanner(System.in);
 static String Text1="Quiero Casarme con Roy y quiero vivir por toda la eternidad ";
 static String Text2="Anoche soñe con Messi y amaneci mojado";
 ///////////////////////////////////////////
    public static void  Ejercicio1(){
  int Count=0;
  int Coincidence=0;
        System.out.println("Introduce un Texto Mi amor: ");
   String Texto=dato.next();
        do {   
            Coincidence=Text1.indexOf(Texto, Coincidence +1);
            Count++;
        } while (Coincidence !=-1);
        System.out.println("Cantidad de coincidencias: " + (Count-1));
    }
    /////////////////////////////////////////
    public static void  Ejercicio2(){
        for (int i = 0; i < Text1.length(); i++) {
            if (i%2 !=0) {
                System.out.println("Caracter "+i+": "+ Text1.charAt(i));
            }
        }
    }
    /////////////////////////////////////////
    public static void  Ejercicio3(){
    String[] AText1=Text1.split(" ");
    String[] AText2=Text2.split(" ");
    
            if (AText1.length >AText2.length) {
                System.out.println("Texto 1 tiene mas palabras");
            }else if(AText1.length < AText2.length){
                System.out.println("Texto 2 tiene mas palabras");
            }
            else{
                System.out.println("Tienen la misma cantidad de palabras");
            }
            
    }
    /////////////////////////////////////////
    public static void  Ejercicio4(){
 
if(Text2.compareToIgnoreCase(Text1)>0){
System.out.println(Text1+" es primera que " + Text2);
}
else if (Text2.compareToIgnoreCase(Text1)<0){
System.out.println(Text1+" es segunda que " + Text2);
}
else{
System.out.println("Son iguales");
}
            
    }
    public static void  Ejercicio5(){
        String NewText="";
        for (int i = 0; i <Text2.length(); i++) {
            if (i%2 !=0) {
             NewText= NewText.concat(String.valueOf(Text2.charAt(i)).toUpperCase());
            }
            else{
                  NewText=NewText.concat(String.valueOf(Text2.charAt(i)).toLowerCase());
            }
        }
        System.out.println(NewText);
}
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio5();
    }
    
}
