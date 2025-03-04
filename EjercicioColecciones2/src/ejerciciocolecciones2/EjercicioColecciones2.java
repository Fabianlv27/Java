/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocolecciones2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author CEEP
 */
public class EjercicioColecciones2 {

    static Scanner dato = new Scanner(System.in);
    static String Nombre;
    static String Apellido1;
    static String Apellido2;
    static String Nacionalidad;

    public static Alumno CrearAlumno(int i) {

        System.out.println("|------------------Alumno " + (i+1) + " ---------------------|");
        System.out.println("Nombre: ");
        Nombre = dato.next();
        System.out.println("Apellido 1");
        Apellido1 = dato.next();
        System.out.println("Apellido 2");
        Apellido2 = dato.next();
        System.out.println("Nacionalidad");
        Nacionalidad = dato.next();

        return new Alumno(Nombre, Apellido1, Apellido2, Nacionalidad);

    }
    

    public static void Vizualizar(ArrayList<Alumno> Alumnos) {
            System.out.println("------------------------------------------------------------------------------------");

        System.out.print("[Nombre]\t\t[Apellido1]\t[Apellido2]\t[Nacionalidad]\n");

        for (Alumno a : Alumnos) {
            a.Show();
        }
    }
public static void Tree(int cantidad){
Set <Alumno> Alumnos =new TreeSet<>(Comparator.comparing(Alumno :: getNombre));

        /*    Alumnos.add(new Alumno("Fabian", "Luna", "Vicente", "Peru"));
            Alumnos.add(new Alumno("Fabian", "Luna", "Vicente", "Paraguay"));
            Alumnos.add(new Alumno("Roy", "Rebuffo", "Tabac", "Argentina"));
            Alumnos.add(new Alumno("Mar", "Clara", "Gomez", "España"));
            Alumnos.add(new Alumno("Rafael", "Gonz", "Pala", "Peru"));
        */    
            for (int i = 0; i < cantidad; i++) {
        Alumnos.add(CrearAlumno(i));
        
    }
            System.out.println("------------------------------------------------------------------------------------");
          System.out.print("[Nombre]\t\t[Apellido1]\t[Apellido2]\t[Nacionalidad]\n");
 
            for (Alumno a : Alumnos) {
        a.Show();
    }
            
}
    public static void AList(int CantAlumnos) {
        System.out.println("*****ArrayList*******");
        System.out.println("*****Aqui puedes colocar Alumnos iguales*******");

        ArrayList<Alumno> Alumnos = new ArrayList<>();


          /*  Alumnos.add(new Alumno("Fabian", "Luna", "Vicente", "Peru"));
            Alumnos.add(new Alumno("Fabian", "Luna", "Vicente", "Paraguay"));
            Alumnos.add(new Alumno("Roy", "Rebuffo", "Tabac", "Argentina"));
            Alumnos.add(new Alumno("Mar", "Clara", "Gomez", "España"));
            Alumnos.add(new Alumno("Rafael", "Gonz", "Pala", "Peru"));
   */
        
       
        
         for (int i = 0; i < CantAlumnos; i++) {
          Alumnos.add(CrearAlumno(i));

          }
        Alumnos.sort(Comparator.comparing(Alumno::getNombre).
                thenComparing(Alumno::getApellido1)
                .thenComparing(Alumno::getApellido2).thenComparing(Alumno :: getNacionalidad)
        );
         Vizualizar(Alumnos);
        
    }

    public static void menu() {
        int Coleccion = 1;

        while (Coleccion != 0) {
            System.out.println("-//-/-/-/-/-//-/-/Menu/-/-/-//-/-/-/-//-/-/");
            System.out.println("Que deseas usar?");
            System.out.println("(1)ArrayList");
            System.out.println("(2)Treeset");
            System.out.println("(0)Salir");
            Coleccion = dato.nextInt();
            if (Coleccion!=0) {
                
                System.out.println("Cuantos Alumnos quieres agregar?");
            int CantAlumnos = dato.nextInt();
             if (Coleccion == 1) {
                AList(CantAlumnos);
            }else{
                Tree(CantAlumnos);
            }
            }
            

           
        }

    }

    public static void main(String[] args) {
        menu();
    }

}
