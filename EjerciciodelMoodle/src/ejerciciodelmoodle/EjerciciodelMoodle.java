/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodelmoodle;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CEEP
 */
public class EjerciciodelMoodle {

    public static int alea(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }
   static  Scanner dato=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int Max=-1;
        int Min=100;
        int Pos=0;
        double TNum=0;
       int[] TbNumeros=new int[100] ;
        for (int i = 0; i < TbNumeros.length; i++) {
            
           TbNumeros[i]=alea(1, 99);
                 
        }
        
        for (int i = 0; i <TbNumeros.length; i++) {
            if (TbNumeros[i]>=Max) {
                Max=TbNumeros[i];
                Pos=i;
            }
        }
        System.out.println("El mayor es --> "+ Max+" y si posicion es: " + Pos);
        
        for (int i = 0; i <TbNumeros.length; i++) {
            if (TbNumeros[i]<Min) {
                Min=TbNumeros[i];
                Pos=i;
            }
        }
        System.out.println("El menor es --> "+ Min+" y si posicion es: " + Pos);
        
        for (int i = 0; i <TbNumeros.length; i++) {
            TNum+=TbNumeros[i];
        }
        System.out.println("La media es : " + TNum/100);
        
        System.out.println("Introduce la posicion a reemplazar: ");
        int Posi=dato.nextInt();
        System.out.println("Introduceel numero: ");
        int Num=dato.nextInt();
       TbNumeros[Posi]=Num;
        System.out.println("Nueva tabla: " + Arrays.toString(TbNumeros));
       int[] Copia=TbNumeros.clone();
       Arrays.sort(Copia);
        System.out.println( "Tabla ordenada"+ Arrays.toString(Copia));
       
    }
    
}
