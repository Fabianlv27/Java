/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuplantilla;

import java.util.Scanner;

public class MenuPlantilla {
        static Scanner dato= new Scanner(System.in);

 public static void Ejercicio1(){
 //Burbuja
    //array a ordenar
        int numeros[]={5,6,2,10,1};
        
        //llamada funcion
        ordenacionBurbuja(numeros);
        
        //mostrar el contenido
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
    }
    
    /**
     * Ordena un array de enteros por el metodo de la burbuja
     * @param lista
     */
    public static void ordenacionBurbuja (int lista[]){
        int cuentaintercambios=0; //Variable que cuenta los intercambios que hacemos
        for (boolean ordenado=false;!ordenado;){ //hasta que no haya mas intercambios no sales
                for (int i=0;i<lista.length-1;i++){ if (lista[i]>lista[i+1]){
                        //intercambio
                        int variableauxiliar=lista[i];
                        lista[i]=lista[i+1];
                        lista[i+1]=variableauxiliar;
                        //indico que ha habido un intercambio mas
                        cuentaintercambios++;
                    }
                }
                //Si no hay intercambios, el array esta ordenado
                if (cuentaintercambios==0){
                    ordenado=true;
                }
                cuentaintercambios=0; //Reinicio la variable
 }
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