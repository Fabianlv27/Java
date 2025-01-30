/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosstring;

import java.util.Arrays;
//Introducir dos cadenas de texto,se pide:introdicir una palabra e indicar cuantas veces aparece en la primera cadena,
//2.-Mostrar los caracteres impares de la primera cadena
//3.-Que cadena tiene mas palabras.
//4.-Indicar alfabeticamente cual es la primera cadena
//5.-Poner en la segunda cadena las plabras impares en mayuscula.

//Meter el numero de DNI y comprobar si la letra esta bien, divider los numeros entre 23 y el resto lo comparamos con una tabla que esta en internet.

/**
 *
 * @author CEEP
 */
public class MetodosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Cadena="Messi el mejor jugador del planeta";
        String Cadena2="Ronaldo el mejor jugador del planeta";
       
        System.out.println("Length: "+ Cadena.length());
        
        System.out.println("CharAt(1): " + Cadena.charAt(1));
        
        System.out.println("IndexOf(\"e\"): "+ Cadena.indexOf("hsjdhjdf"));
        
        System.out.println(" Segunda coincidencia de e : IndexOf(\"e\",cadena.indexOf(\"e\")+1): "+ Cadena.indexOf("e",Cadena.indexOf("e")+1));
        
        System.out.println("Ultimo indice: Cadena.LastIndexOf(e): " + Cadena.lastIndexOf("e"));
        
        System.out.println("Penultimo indice: Cadena.lastIndexOf(\"e\",Cadena.lastIndexOf(\"e\")-1): " + Cadena.lastIndexOf("e",Cadena.lastIndexOf("e")-1));
        
        System.out.println("Cadena.compareToIgnoreCase(Cadena2): " + Cadena.compareToIgnoreCase(Cadena2));
        
        System.out.println("Cadena.Concat(Cadena2): "+ Cadena.concat( Cadena2));
        
        System.out.println("Cadena.contains(\"Messi\"): "+ Cadena.contains("Messi"));
        
        System.out.println("Cadena.endsWith(\"Messi\"): "+ Cadena.endsWith("Messi"));
        
        System.out.println("Cadena.startsWith(\"Messi\"): "+ Cadena.startsWith("Messi"));
        
        System.out.println("Cadena.equals(\"Messi\"): "+ Cadena.equals("Messi"));
        
        System.out.println("Cadena.isEmpty(): " + Cadena.isEmpty());
        
        System.out.println(" Cadena.replace(\"mejor\", \"peor\")"+ Cadena.replace("mejor", "peor"));
        
        System.out.println(" Cadena.replaceAll(\"mejor\", \"peor\")"+ Cadena.replace("e", "a"));
        
        System.out.println("Cadena.substring(1,6): " + Cadena.substring(1,6));
        
        System.out.println("Cadena.toCharArray(): " + Arrays.toString(Cadena.toCharArray()) );
        
        System.out.println("Cadena.toLowerCase(): "+ Cadena.toLowerCase());
        
        System.out.println("Cadena.toUpperCase()"+ Cadena.toUpperCase());
        
        
    }
    
}
