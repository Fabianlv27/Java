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
public class Empresas {

    static Scanner dato=new Scanner(System.in);
    static Empleado[] Empleados=new Empleado[0];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Sedes={"Madrid","Barcelona","Valencia","Oviedo"};
        String[] Departamentos={"Ventas","RR.HH","Produccion"};
        
        System.out.println("Ingrese el nombre Completo: ");
        dato.nextLine();
        String Nombre=dato.nextLine();
        System.out.println("Ingrese el DNI: ");
        int Dni=dato.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int Año=dato.nextInt();
        System.out.println("Tiene reduccion de jornada laboral?(0:\"No\". 1:\"Si\")");
        int Confirmation=dato.nextInt();
        System.out.println("Seleccione la sede: \b (1) Madrid \b (2) Barcelona \b (3) Valencia \b (4) Oviedo");
        int IS=dato.nextInt();
        System.out.println("Seleccione el Deparatamento: \b (1) Ventas \b (2) RR.HH \b (3) Produccion ");
        int IDP=dato.nextInt();

            Empleado[] CopiEmpleados=Arrays.copyOf(Empleados,Empleados.length + 1);
            CopiEmpleados[CopiEmpleados.length - 1]=new Empleado(Nombre, Dni, Año, Sedes[IS], Departamentos[IDP],Confirmation);
            Empleados=CopiEmpleados;
            System.out.println("Empleados: " + Arrays.toString(Empleados));
        
    }
    
}
