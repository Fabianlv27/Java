/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosdimencionesejercicios;

import java.util.Arrays;

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
        String[] DNI = {"12309678A", "4752286934B", "12345878F", "1472254586X", "478222134D"};

        for (int i = 0; i < 5; i++) {
            TB[i][0] = Nombres[i];
        }
        for (int i = 0; i < 5; i++) {
            TB[i][1] = Generos[i];
        }
        for (int i = 0; i < 5; i++) {
            TB[i][2] = DNI[i];
        }
    }

    public static void Vizualizar() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(TB[i][j] + "\t");

            }
            System.out.println("");

        }
    }

    public static void DniComprove() {
                System.out.println("");

        int CDni = 0;
        String[] TDni = new String[23];
        RellenarTDNI(TDni);

        for (int i = 0; i < 5; i++) {
            String Numbers = TB[i][2].substring(0, TB[i][2].length() - 1);
            if (Numbers.length() == 8) {
                long LNumbers = Long.parseLong(Numbers);
                int Resto = (int) LNumbers % 23;
               // System.out.println(TDni[Resto]);
                //  System.out.println(TB[i][2].substring(8, 9));

                if (TB[i][2].substring(8, 9).equalsIgnoreCase(TDni[Resto])) {
                    System.out.println("El DNI  " + TB[i][2] + " del Usuario " + TB[i][0] + " Es Correcto");
                    CDni++;
                } else {
                    System.out.println("El DNI  " + TB[i][2] + " del Usuario " + TB[i][0] + " Es Incorrecto");
                    System.out.println("El DNI deberia ser: " + Numbers.concat(TDni[Resto]));

                }

            } else {
                System.out.println("\"El DNI  " + TB[i][2] + " del Usuario " + TB[i][0] + " Es Incorrecto\n No tiene 8 digitos");
            }
        }
        System.out.println("Hay " + CDni + " Que tienen el dni correcto");
    }

    public static void RellenarTDNI(String[] tbDNI) {
        tbDNI[0] = "T";
        tbDNI[1] = "R";
        tbDNI[2] = "W";
        tbDNI[3] = "A";
        tbDNI[4] = "G";
        tbDNI[5] = "M";
        tbDNI[6] = "Y";
        tbDNI[7] = "F";
        tbDNI[8] = "P";
        tbDNI[9] = "D";
        tbDNI[10] = "X";
        tbDNI[11] = "B";
        tbDNI[12] = "N";
        tbDNI[13] = "J";
        tbDNI[14] = "Z";
        tbDNI[15] = "S";
        tbDNI[16] = "Q";
        tbDNI[17] = "V";
        tbDNI[18] = "H";
        tbDNI[19] = "L";
        tbDNI[20] = "C";
        tbDNI[21] = "K";
        tbDNI[22] = "E";

    }

    public static void NombresViz() {

        for (int i = 0; i < 5; i++) {
            String[] NombreSeparados = TB[i][0].split(" ");
            System.out.println("");
            System.out.println("El Nombre de la persona " + (i + 1) + " es: " + NombreSeparados[0]);
            System.out.println("El Apellido de la persona " + (i + 1) + " es: " + NombreSeparados[1]);

        }
    }

    public static void Sexooooo() {
        int cHombres = 0;
        for (int i = 0; i < 5; i++) {
            if (TB[i][1] == "M") {
                cHombres++;
            }

        }
        System.out.println("");
        System.out.println("Hay " + cHombres + " Hombres");
        System.out.println("Hay " + (5 - cHombres) + " Mujeres");
    }

    public static void DniCompare() {
        Boolean Ordenados = false;
        int CCambios = 0;
        while (!Ordenados) {
            CCambios = 0;
            for (int i = 0; i < 4; i++) {

                if (TB[i][2].compareToIgnoreCase(TB[i + 1][2]) < 0) {

                    for (int j = 0; j < 3; j++) {
                        String Temp = TB[i][j];
                        TB[i][j] = TB[i + 1][j];
                        TB[i + 1][j] = Temp;
                    }
                    CCambios++;

                }

            }
            if (CCambios == 0) {
                Ordenados = true;
            }
        }
        System.out.println("");
        Vizualizar();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("TB.length" + TB[1].length);
        Rellenar();
        Vizualizar();
        DniComprove();
        NombresViz();
        Sexooooo();
        DniCompare();
    }

}
