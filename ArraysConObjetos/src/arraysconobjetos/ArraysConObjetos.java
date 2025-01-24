/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysconobjetos;
//Crear dos arrays de 10 elementos c/u , el primero : nombres, segundo:notas, cositas: 
//1-Un listado con los nombres y notas de los alum

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

//2-Ver el listado ordenado por nombres
//3.-Otro listado ordenado de manera descendente por las notas
//4-Copa de solo aprobados y solo suspensos
//5.-Metodo que me permita insertar ,eliminar y editar el alumno y/o nota
//6.-Generar una clase con el resultado final, con dos atributos : nombre y nota en donde creemos los objetos del array que tengamos
/**
 *
 * @author CEEP
 */
public class ArraysConObjetos {

    static Scanner dato = new Scanner(System.in);
    static String[] Nombres = new String[]{"Messi", "Ronaldo", "Neymar", "Yamal", "Vinicius", "Harry", "Son", "Gavi", "Vidal", "Suarez"};
    static int[] Notas = new int[10];
    static String[]CopyNombres=Nombres.clone();
    static  int[] CopyNotas=Notas.clone();
    
    public ArraysConObjetos() {
        
    }

    public static void RellenarArray(int[] Lista) {
        boolean isEmpty=true;
        for(int numero:Lista){
            if (numero!=0) {
                isEmpty=false;
            }
        }
        if (isEmpty) {
               for (int i = 0; i < Lista.length; i++) {
            Lista[i] = alea(0, 9);
        }
             
        }
      System.out.println(Arrays.toString(Lista));

    }

    /**
     * ;
     *
     * @param args the command line arguments
     */
    public static int alea(int x, int y) {
        return (int) ((Math.round(Math.random() * (y - x)) + x));
    }

    public static void Vizualizar(int[] Array1, String[] Array2) {
        for (int i = 0; i < Array1.length; i++) {
            System.out.print("Alumno: " + Array2[i]);
            System.out.print("\t Nota: " + Array1[i] + "\n");

        }
    }

    public static int Choise() {
        int Choise;
        System.out.println("Que quieres insertar?");
        System.out.println("0.-Nombre");
        System.out.println("1.-Nota");
        Choise = dato.nextInt();
        return Choise;
    }

    public static void menu() {
        int option = -1;
        while (option != 0) {
            System.out.println("Menu");
            System.out.println("=====\n");
            System.out.println("\t (1) Ver el listado de nombres y notas.-");
            System.out.println("\t (2) Ver listado ordenado por nombres.-");
            System.out.println("\t (3) Ver listado ordenado por notas");
            System.out.println("\t (4) Ver los aprobados y desaprobados.-");
            System.out.println("\t (5) Insertar alumno o nota");
            System.out.println("\t (6) Eliminar alumno o nota");
            System.out.println("\t (7) Editar alumno o nota");
            System.out.println("\t (8)Crear una lista con objetos Alumnos");
            System.out.println("\t (0) Salir");
            System.out.println("\n Seleccione una opcion: ");
            option = dato.nextInt();
            switch (option) {
                case 1:
                    Visualizar1();
                    break;
                case 2:
                    OrderByName();
                    break;
                case 3:
                    OrderByGradesDes();
                    break;
                case 4:
                    DesApOnly();
                    break;
                case 5:
                    InsertarElemento();
                    break;
                case 6:
                   EliminarElemento();
                    break;
                case 7:
                    Editar();
                    break;
                case 8:
                    CreateAlumnos(Nombres, Notas);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            for (int i = 1; i < 3; i++) {
                System.out.println("");
            }
        }
    }

    public static void CreateAlumnos(String[] Nombres, int[] Notas) {
        Alumno[] Alumnos = new Alumno[Nombres.length];
        for (int i = 0; i < Notas.length; i++) {
            Alumnos[i] = new Alumno(Nombres[i], Notas[i]);

        }
        System.out.println("Lista de Alumnos con sus notas" + Arrays.toString(Alumnos));
    }

    public static void Visualizar1() {

        RellenarArray(Notas);
        Vizualizar(Notas, Nombres);
    }

    public static void OrderByName() {
        System.out.println("///////Arrays Originales:");
        RellenarArray(Notas);
        Vizualizar(Notas, Nombres);
        int C_Movimientos = 0;

        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < Nombres.length-1; i++) {
                C_Movimientos = 0;
                if (CopyNombres[i].compareToIgnoreCase(CopyNombres[i+1]) > 0) {
                    //Cambio la posicion del nombre
                    String Temp = CopyNombres[i];
                    CopyNombres[i] = CopyNombres[i + 1];
                    CopyNombres[i + 1] = Temp;
                    //Cambio la posicion de las Notas
                    int TempN = CopyNotas[i];
                    CopyNotas[i] = CopyNotas[i + 1];
                    CopyNotas[i + 1] = TempN;

                    C_Movimientos++;

                }
                if (C_Movimientos == 0) {
                    ordenado = true;
                }

            }
        }
        System.out.println("Arrays Ordenados:");

        Vizualizar(Notas, Nombres);
    }

    public static void OrderByGradesDes() {
        System.out.println("///////NotasOrdenadas Descendentemente :");
        Arrays.sort(Notas);
        for (int i = Notas.length - 1; i > 0; i--) {
            System.out.print("Alumno: " + Nombres[i]);
            System.out.print("\t Nota: " + Notas[i] + "\n");
        }
    }

    public static void DesApOnly() {

        int C_Aprobados = 0;
        int C_Desaprobados = 0;
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] >= 5) {
                C_Aprobados++;
            } else {
                C_Desaprobados++;
            }

        }

        int[] AprOnly = new int[C_Aprobados];
        int[] DesOnly = new int[C_Desaprobados];
        int CAprPos = 0;
        int CDesPos = 0;
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] >= 5) {
                AprOnly[CAprPos] = Notas[i];
                CAprPos++;
            } else {
                DesOnly[CDesPos] = Notas[i];
                CDesPos++;
            }

        }

        System.out.println("///Aprobados");
        Vizualizar(AprOnly, Nombres);
        System.out.println("////Desaprobados");
        Vizualizar(DesOnly, Nombres);
    }

    public static void InsertarElemento() {
        String Nombre;
        int Nota;
        int Pos;

        RellenarArray(Notas);

            System.out.println("Notas Rellenadas: " + Arrays.toString(Notas));


            System.out.println("Insertar un Nombre");
            Nombre = dato.next();
             System.out.println("Insertar la Nota");
            Nota = dato.nextInt();
            System.out.println("Insertar una posicion");
            Pos= dato.nextInt();
           
            
            //Creamos una copia del array
            String[] NewNombreArr = new String[Nombres.length + 1];
            //Colocamos el nombre en la ultima posicion en el nuevo array
            NewNombreArr[Pos] = Nombre;
            //Copiamos los elementos del array original al nuevo
            System.arraycopy(Nombres, 0, NewNombreArr, 0, Pos);
            System.arraycopy(Nombres, Pos, NewNombreArr, Pos+1, NewNombreArr.length-Pos-1);
            



            
            int[] NewNotasArr = new int[Notas.length + 1];
            NewNotasArr[Pos] = Nota;
            System.arraycopy(Notas, 0, NewNotasArr, 0, Pos);
            System.arraycopy(Notas, Pos, NewNotasArr, Pos +1,NewNotasArr.length-Pos-1);
        

            //System.out.println("Array de nombres: " + Arrays.toString(Nombres));
                        //Mostrar
            System.out.println("Array con nuevo nombre: " + Arrays.toString(NewNombreArr));
            System.out.println("Array de notas actualizado: " + Arrays.toString(NewNotasArr));
        

    }

    public static void EliminarElemento() {
        int Numero = 0;
        System.out.println("Insertar la Posicion a eliminar");
        Numero = dato.nextInt();

        String[] NewNombres = new String[Nombres.length - 1];
        System.arraycopy(Nombres, 0, NewNombres, 0, Numero);
        System.arraycopy(Nombres, Numero + 1, NewNombres, Numero, Nombres.length - Numero - 1);
        System.out.println("Nuevo Array : " + Arrays.toString(NewNombres));

        String[] NewNotas = new String[Notas.length - 1];
        System.arraycopy(Notas, 0, NewNotas, 0, Numero);
        System.arraycopy(Nombres, Numero + 1, NewNotas, Numero, Notas.length - Numero - 1);
        System.out.println("Nuevo Array: " + Arrays.toString(NewNombres));

    }

    public static void Editar() {
        int Numero;
        int Choise = Choise();
        int Nota;
        System.out.println("Insertar la Posicion del alumno a editar");
        Numero = dato.nextInt();
        if (Choise == 0) {
            String Nombre;
            System.out.println("Insertar un nuevo Nombre");
            Nombre = dato.next();
            Nombres[Numero] = Nombre;
        } else {
     
            System.out.println("Insertar una nueva nota: ");
            Nota = dato.nextInt();
            Notas[Numero] = Nota;

        }
        
            System.out.println("Nuevo Array: " + Arrays.toString(Nombres));
            System.out.println("Nuevo Array: " + Arrays.toString(Notas));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        menu();

    }

}
