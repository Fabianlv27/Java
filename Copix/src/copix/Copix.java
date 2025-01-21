/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copix;

import java.util.Arrays;

/**
 *
 * @author CEEP
 */
public class Copix {

    public static void main(String[] args) {
         //Copyof
         int[]Original={1,2,3,4};
         System.out.println("Array Original: "+ Arrays.toString(Original));
         int[] copy =Arrays.copyOf(Original,5); //Me creo otro array completamente nuevo pero copiamos
         //los elementos de Original, le decimos que va a tener 5 elementos
         System.out.println("Array copyOf: "+ Arrays.toString(copy));
         
         //RangeCopy
         
         int[] vanilla={1,2,3,4,5,6};
         System.out.println("Array Original: "+ Arrays.toString(vanilla));
        System.out.println("Array copyOfRange"+ Arrays.toString(Arrays.copyOfRange(vanilla, 1, 5)) );
        
        //ArrayCopy
        int[] Array={1,2,3,4,5,6,7};
        int[] TBArrayCopy= new int[10];
        System.arraycopy(Array, 3, TBArrayCopy, 2, 3);
        System.out.println(Arrays.toString(TBArrayCopy));
        //ouput [0,0,4,5,6,0,0,0,0,0]
        
        //Comparar Arrays
        
        int[] ArrayDos={1,2,1,1,6};
        int[] ArrayTres= ArrayDos.clone();
        
        System.out.println("Comparar con == , compara elemento: "+ (ArrayDos==ArrayTres) );
        System.out.println("Comparar con Arrays.equals, compara el contenido: "+ (Arrays.equals(ArrayDos, ArrayTres)) );
        
    }
    
}
