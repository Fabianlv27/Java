/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenjava1;

import java.util.Scanner;

/**
 *
 * @author CEEP
 */
public class EXAMENJAVA1 {
static int[] TBNum=new int[49];
   static  Scanner dato=new Scanner(System.in);
   
   public static int alea(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }
public static void Introducir(){
    System.out.println("Introduce un numero: ");
    int num=dato.nextInt();
    TBNum[4]=num;
    System.out.println("Nueva Tabla:");
    Vizualizar(TBNum);
}
    public static void Maximo(){
        int Max=0;
        int Pos=0;
        for (int i = 0; i < TBNum.length; i++) {
            if (TBNum[i]>Max) {
                Max=TBNum[i];
                Pos=i;
            }
            
            
        }
        System.out.println("\nEl Primer maximo es: " + Max +"\nY esta en la posicion: "+ Pos);
    }
        public static void Minimo(){
        int Min=10;
        int Pos=0;
        for (int i = 0; i < TBNum.length; i++) {
            if (TBNum[i]<=Min) {
                Min=TBNum[i];
                Pos=i;
            }
            
        }
        System.out.println("\nEl ultimo minimo es: " + Min +"\nY esta en la posicion: "+ Pos);
    }
           public static void Media(){
               double Tnumero=0;
        for (int i = 0; i < TBNum.length; i++) {
                Tnumero+=TBNum[i];
                
            
        }
        System.out.printf("\nLa media es: %.2f\n ",(Tnumero/49)  );
    }
       
    public static void CargarArray(int[] TB){
        for (int i = 0; i < TB.length; i++) {
            TB[i]=alea(1, 9);
            
        }
    }
    public static void Vizualizar(int []TB ) {
          for (int i = 0; i <49; i+=7) {
              for (int j = 0; j < 7; j++) {
                   System.out.print(TB[i+j]+"\t");
                  
              }
              System.out.println("");
        }

    }
    public static void main(String[] args) {
        
        CargarArray(TBNum);
        Vizualizar(TBNum);
        Maximo();
        Minimo();
        Media();
        Introducir();
    }
    
}
