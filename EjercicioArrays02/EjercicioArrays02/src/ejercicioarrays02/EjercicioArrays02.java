/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarrays02;

/**
 *
 * @author PROFESOR
 */
public class EjercicioArrays02 {

    static String tb[][] = new String[5][3];
    static String[] tbDNI = new String[23];

    public static void main(String[] args) {
       String Palabra="Leohjhjhjhjh1";
        System.out.println(Palabra.substring(0,Palabra.length()-1));
        cargarTabla();
      
        visualizarTabla("hjkjkkkl");
        System.out.println("\nLos DNIs que estan bien son: " + comprobarDNI());
        System.out.println("\n");
        separarNombres();
        separarNombres2();
        separarNombres3();
        System.out.println("\nHay " + contarGeneros() + " hombres y "
                + (tb.length - contarGeneros()) + " mujeres.\n");
        ordenarDni();
    }
public static int Sumar(int X,int Y){
    
    int Suma=X+Y;
    return Suma;
   


}
    public static void ordenarDni() {
        Boolean ordenados = false;
        int cCambios = 0;
        while (!ordenados) {
            cCambios = 0;
            for (int i = 0; i < tb.length - 1; i++) {
                if (tb[i][0].compareToIgnoreCase(tb[i + 1][0]) < 0) {
                    for (int j = 0; j < 3; j++) {
                        String Temp = tb[i][j];
                        tb[i][j] = tb[i + 1][j];
                        tb[i + 1][j] = Temp;

                    }
                    cCambios++;
                }

            }
            if (cCambios == 0) {
                ordenados=true;
            }
                
            
        }
        visualizarTabla("DATOS ORDENADOS");
    }

    public static void cargarTabla() {
        tb[0][0] = "54268967F";
        tb[1][0] = "41357894M";
        tb[2][0] = "24987536K";
        tb[3][0] = "45872647R";
        tb[4][0] = "65874129A";
        tb[0][1] = "Carlos Soria";
        tb[1][1] = "Ernesto Sevilla";
        tb[2][1] = "Elsa Capuntas";
        tb[3][1] = "Mario Neta";
        tb[4][1] = "Susana Horia";
        tb[0][2] = "hombre";
        tb[1][2] = "hombre";
        tb[2][2] = "mujer";
        tb[3][2] = "hombre";
        tb[4][2] = "mujer";

    }

    public static void visualizarTabla(String mensaje) {
        System.out.println(mensaje + "\n");
        /*System.out.println(tb.length);
        System.out.println(tb[0].length);*/
        System.out.println("\tDNI\t\tNOMBRE COMPLETO\tSEXO");
        System.out.println("\t===\t\t====== ========\t====");
        for (int i = 0; i < tb.length; i++) {
            
            for (int j = 0; j < tb[i].length; j++) {
                
                System.out.print("\t" + tb[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int comprobarDNI() {
        tablaDNI();
        long dni;
        int pos;
        int contar = 0;
        
        for (int i = 0; i < tb.length; i++) {
            
            dni = Long.parseLong(tb[i][0].substring(0, tb[i][0].length() - 1));
            pos = (int) dni % 23;
            
            
            if (tbDNI[pos].equalsIgnoreCase(tb[i][0].substring(tb[i][0].length() - 1,tb[i][0].length()))) {
                contar++;
                System.out.println(tb[i][0]);
            }
        }
        return contar;
    }

    public static void tablaDNI() {
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

    public static void separarNombres() {
        int pos;
        System.out.println("\n\nVisualizacion de nombre "
                + "y apellido por separado metodo 1:");
        System.out.println("\tNOMBRE\t\tAPELLIDO");
        System.out.println("\t======\t\t========");
        
        for (int i = 0; i < tb.length; i++) {
            pos = (tb[i][1].indexOf(" "));
            System.out.print("\t" + tb[i][1].substring(0, pos) + "\t\t");
            System.out.println(tb[i][1].substring(pos + 1,
                    tb[i][1].length()));
        }
        System.out.println("\n");
    }

    public static void separarNombres2() {
        System.out.println("\n\nVisualizacion de nombre "
                + "y apellido por separado metodo 2:");
        System.out.println("\tNOMBRE\t\tAPELLIDO");
        System.out.println("\t======\t\t========");
        String palabras[];
        for (int i = 0; i < tb.length; i++) {
            palabras = tb[i][1].split(" ");
            System.out.print("\t" + palabras[0] + "\t\t");
            System.out.println(palabras[1]);
        }
        System.out.println("\n");
    }

    public static void separarNombres3() {
        System.out.println("\n\nVisualizacion de nombre "
                + "y apellido por separado metodo 3:");
        System.out.println("\tNOMBRE\t\tAPELLIDO");
        System.out.println("\t======\t\t========");
        String palabra1;
        String palabra2;
        int j;
        for (int i = 0; i < tb.length; i++) {
            for (j = 0; j < tb[i][1].length(); j++) {
                if (tb[i][1].charAt(j) == ' ') {
                    break;
                }
            }
            //System.out.println(j);
            palabra1 = "";
            palabra2 = "";
            for (int k = 0; k < j; k++) {
                palabra1 = palabra1 + tb[i][1].charAt(k);
            }
            for (int k = j + 1; k < tb[i][1].length(); k++) {
                palabra2 = palabra2 + tb[i][1].charAt(k);
            }
            System.out.println("\t" + palabra1 + "\t\t" + palabra2);
        }
        System.out.println("");
    }

    public static int contarGeneros() {
        int cont = 0;
        for (int i = 0; i < tb.length; i++) {
            if (tb[i][2].equalsIgnoreCase("HOMBRE")) {
                cont++;
            }
        }
        return cont;
    }
}
