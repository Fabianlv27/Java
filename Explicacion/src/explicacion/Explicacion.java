/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explicacion;

import java.util.Arrays;

/**
 *
 * @author CEEP
 */
public class Explicacion {
    public static int Randomizer(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sin especificar el tamaño
        int [][] tabla;
        int precios[]; //Heredado de c/c++
        //reservar espacio en la memoria
   tabla= new int [10][10];
   precios=new int[10];

        //iniciar el array
      tabla[0][8]=1;
      //hacerlo todo a la vez
       int  tablaUni[]=new int[5];
      int prueba[]=new int[3];
      String []alumnos={"Paco","Ana","Alicia","Alba"};
      Arrays.sort(alumnos);
        System.out.println(Arrays.toString(alumnos));
      String[] letras={"a","b","c"};
  
        System.out.println(Arrays.toString(letras));
        // Se pueden usar en metodos
      //  int[][]datosRetorno=metodo();   
//Arrays.sort(datosRetorno);
//        System.out.println(Arrays.toString(datosRetorno));
        
        //Recorrer por elemento ForEach
        for (int elemento:tablaUni) {
            elemento=Randomizer(1,9);
            System.out.println(elemento);
        }
        
        //Busqueda binaria de elementos en un array ordenado(la posicion), solo funciona si esta ordenado
        int posElement=Arrays.binarySearch(letras,"c");
        System.out.println(posElement);
        
        //inicializacion masiva fill
        int[][] MasiveArray= new int[3][6];
        Arrays.fill(MasiveArray[1], 1);
        Arrays.fill(MasiveArray[2], 2);
       
        System.out.println("Array[0]");
        //el metodo clone devuelve un nuevo array independiente del original :),
        //si los tipos no son primitivos te devuelve Shallow copy
        int edadesClonadas[][]=MasiveArray.clone();
        System.out.println(Arrays.toString(edadesClonadas[1]));
        //Shallow copy
        Persona objPersona[]={new Persona("Juan"),new Persona("Daniela")};
       Persona ClonePersona[]=objPersona.clone();
       ClonePersona[0].setName("Juana");
        System.out.println(Arrays.toString(ClonePersona));
        System.out.println(Arrays.toString(objPersona));

       
        
    }
   public static int[][] metodo(){
   int [][] arrayRetorno=new int[4][2];
   return arrayRetorno;
   }
    
}
