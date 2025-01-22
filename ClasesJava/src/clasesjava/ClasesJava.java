/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesjava;

import java.awt.SystemTray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author CEEP
 */
public class ClasesJava {
static Scanner dato=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    //Generar 3 Personas y meterlos en un array y decir cuantos estan jubilados
    public static void Ejercicio(){
       Persona[] Personas= new Persona[5];
int C_Jub=0;
       Personas[0]=new Persona("jose","martines","hombre",24);
       Personas[1]=new Persona("Mariana","Caseres","Mujer",99);
       Personas[2]=new Persona("Osvaldo","Vicente","hombre",9);
       Personas[3]=new Persona("Oscar","Hernandez","hombre",5);
       Personas[4]=new Persona("Leo","Messi","hombre",35);
       
   /*     System.out.println(Arrays.toString(Personas));
        for (int i = 0; i < Personas.length -1; i++) {
           if(Personas[i].isJubilar()){
             C_Jub++;
           }
         System.out.println(Personas[i].getNombre()); 
        }
     System.out.println("Hay " + C_Jub + " Jubilados"); */
 int CCambios=0;
     for(boolean ordenado=false;!ordenado;){
    
       for (int i = 0; i <Personas.length-1; i++) {
            if (Personas[i].getEdad()>Personas[i+1].getEdad()) {
               Persona Temp=Personas[i];
               Personas[i]=Personas[i+1];
               Personas[i+1]=Temp;
               CCambios++;
           }  
        }
         if (CCambios==0) {
             ordenado=true;
         }
        CCambios=0;
     }
      
        System.out.println("Array Ordenado por edades: " + Arrays.toString(Personas));
        
        Persona NewPersona=new Persona("Cristiano", "Ronaldo", "hombre", 28);
        System.out.println("Ingrese en que posicion lo quieres colocar ");
        int Pos=dato.nextInt();
        //AgregarElemento(Personas, NewPersona,Pos);
        EliminarElemeto(Personas, Pos);
   
    }
    public static void AgregarElemento(Persona[] Lista ,Persona NewObj,int Posicion){
        //Creamos Un nuevo array que mida uno mas.
        Persona[]ClonePersonas=new Persona[Lista.length + 1];
        //Coloca el elemento en la posicion indicada
        ClonePersonas[Posicion]=NewObj;
        //Coloca los elementos de la lista original desde el 0 y la cantidad de elentos coincide con la posicion
        System.arraycopy(Lista, 0, ClonePersonas, 0, Posicion);
        //Colocamos los elementos despues de la posicion ,incluyendo el elemento de la posicion indicada en el array original
        System.arraycopy(Lista, Posicion , ClonePersonas, Posicion+1, (Lista.length -Posicion-1));
        System.out.println(Arrays.toString(ClonePersonas));
    }
    public static void EliminarElemeto(Persona[] Lista,int Pos){
            Persona[]ClonePersonas=new Persona[Lista.length - 1];
            //Copia todos los elementos desde el inicio y la cantidad que coincide con la posicion
            System.arraycopy(Lista, 0, ClonePersonas, 0, Pos);
            System.arraycopy(Lista, Pos +1 , ClonePersonas, Pos, (Lista.length -Pos-1));
            System.out.println(Arrays.toString(ClonePersonas));



    }
   //Crear dos arrays de 10 elementos c/u , el primero : nombres, segundo:notas, cositas: 
    //1-Un listado con los nombres y notas de los alumnos
    //2-Ver el listado ordenado por nombres
    //3.-Otro listado ordenado de manera descendente por las notas
    //4-Copa de solo aprobados y solo suspensos
    //5.-Metodo que me permita insertar ,eliminar y editar el alumno y/o nota
    //6.-Generar una clase con el resultado final, con dos atributos : nombre y nota en donde creemos los objetos del array que tengamos
    

 

    public ClasesJava() {
    }
    public static void main(String[] args) {
        //Ejercicio();
        Ejercicio();
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
