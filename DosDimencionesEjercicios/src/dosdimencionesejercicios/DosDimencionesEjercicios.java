/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosdimencionesejercicios;

/**
 *
 * @author CEEP
 */
//cogemos una tabla bidimencional de 5 filas y 3 columnas, en la primera columna se metera 5 dni,
//en la segunda un nombre y apellido separado por espacio
//en la tercera los sexos (hombre y mujer), vizualizar la tabla de manera que quede bien
//Saber cuantos dni estan bien
//Separar el nombre de los apellidos y vizualizarlos por separado
//cuantos hombre y mujeres hay
//Ordenar por el dni de manera ascendente.
public class DosDimencionesEjercicios {

    static String[][] TB = new String[5][3];

    public static void Rellenar() {

        String[] Nombres = {"Fabian Luna", "Leo Paredez", "Roy Rebuffo", "Mar Clara", "Rafael Gonzales"};
        String[] Generos = {"M", "M", "M", "F", "M"};
        String[] DNI = {"1243822675", "4752286934", "12458322", "1472254586", "4782221345"};

        for (int i = 0; i < 5; i++) {
       TB[i][0]=Nombres[i];
        }
        for (int i = 0; i < 5; i++) {
       TB[i][1]=Generos[i];
        }
        for (int i = 0; i < 5; i++) {
       TB[i][2]=DNI[i];
        }
    }
    public static void Vizualizar(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(TB[i][j] + "\t");
                
            }
            System.out.println("");
            
        }
    }
    public static void DniComprove(){
        int CDni=0;
        for (int i = 0; i < 5; i++) {
            if (TB[i][2].length()==8) {
                CDni++;
            }
            
        }
        System.out.println("Hay "+CDni+" Que tienen el dni correcto");
    }
    public static void NombresViz(){

        for (int i = 0; i < 5; i++) {
         String[] NombreSeparados=TB[i][0].split(" ");
            System.out.println("");
            System.out.println("El Nombre de la persona "+ (i+1)+ " es: "+NombreSeparados[0]);
            System.out.println("El Apellido de la persona "+ (i+1)+ " es: "+NombreSeparados[1]);
         
        }
    }
      public static void Sexooooo(){
        int cHombres=0;
        for (int i = 0; i < 5; i++) {
            if (TB[i][1]=="M") {
                cHombres++;
            }
            
        }
          System.out.println("");
        System.out.println("Hay "+cHombres+" Hombres");
        System.out.println("Hay "+(5- cHombres)+" Mujeres");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rellenar();
        Vizualizar();
        DniComprove();
        NombresViz();
        Sexooooo();
    }

}
