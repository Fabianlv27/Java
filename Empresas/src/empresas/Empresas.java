/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CEEP
 */

//cogemos una tabla bidimencional de 5 filas y 3 columnas, en la primera columna se metera 5 dni,
//en la segunda un nombre t apellido separado por espacio
//en la tercera los sexos (hombre y mujer), vizualizar la tabla de manera que quede bien

//Saber cuantos dni estan bien
//Separar el nombre de los apellidos y vizualizarlos por separado
//cuantos hombre y mujeres hay
//Ordenar por el dni de manera ascendente.


public class Empresas {

    static Scanner dato=new Scanner(System.in);
    static Empleado[] Empleados=new Empleado[0];
      static String[] Sedes={"Madrid","Barcelona","Valencia","Oviedo"};
      static String[] Departamentos={"Ventas","RR.HH","Produccion"};
    /**
     * @param args the command line arguments
     */
    public static void AñadirUsuario(){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        System.out.println("Ingrese el nombre Completo: ");
       // dato.nextLine();
        String Nombre=dato.nextLine();
        System.out.println("Ingrese el DNI: ");
        int Dni=dato.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int Año=dato.nextInt();
        System.out.println("Tiene reduccion de jornada laboral?(0:\"No\". 1:\"Si\")");
        int Confirmation=dato.nextInt();
        System.out.println("Seleccione la sede: \n (1) Madrid \n (2) Barcelona \n (3) Valencia \n (4) Oviedo");
        int IS=dato.nextInt();
        System.out.println("Seleccione el Deparatamento: \n (1) Ventas \n (2) RR.HH \n (3) Produccion ");
        int IDP=dato.nextInt();
        
            if(Empleados.length >0){
                        Empleado[] CopiEmpleados=Arrays.copyOf(Empleados,(Empleados.length + 1));
                        CopiEmpleados[CopiEmpleados.length - 1]=new Empleado(Nombre, Dni, Año, Sedes[IS], Departamentos[IDP],Confirmation);
                        Empleados=CopiEmpleados;
            }
            else{
             Empleado[] CopiEmpleados=new Empleado[1];
             CopiEmpleados[0]= new Empleado(Nombre, Dni, Año, Sedes[IS], Departamentos[IDP], Confirmation);
            Empleados=CopiEmpleados;
            }

            System.out.println(Arrays.toString(Empleados));
        
    }
    
}
