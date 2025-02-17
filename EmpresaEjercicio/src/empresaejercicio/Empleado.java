
package empresaejercicio;

import java.util.Random;


public class Empleado {
    
    Random r = new Random();
    
    int codigo;
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    String nacimiento;
    boolean reduccion;
    
    
    public Empleado(){
        
    String[] nombres = {"Pablo","Pepe","Juan","Ana","Luis","Juana","Sara","Lidia","Lili","Tina","Kiko"};
    
    String[] apellidos = { "García", "Fernández", "González", "Rodríguez", "López", "Martínez", "Sánchez", "Pérez", "Gómez", "Martín", "Jiménez", "Ruiz", "Hernández", "Díaz", "Moreno", "Álvarez", "Muñoz","Romero", "Alonso", "Gutiérrez"
        };
    String[] dnis = {
    "12345678Z", "87654321X", "45678912M", "78912345L", "14725836P",
    "36925814R", "95175346D", "85274169J", "35715948N", "74185296T",
    "15935728C", "25874163Y", "65432178K", "98765432B", "32145698H"
    };
    
    codigo = r.nextInt(100);
    this.dni = dnis[r.nextInt(15)];
    this.nombre = nombres[r.nextInt(11)];
    this.apellido1 = apellidos[r.nextInt(20)];
    this.apellido2 = apellidos[r.nextInt(20)];
    this.nacimiento = (r.nextInt(31)+"-"+r.nextInt(13)+"-20"+r.nextInt(3)+r.nextInt(10));
    this.reduccion = r.nextBoolean();
    
    }

    public Empleado(int codigo, String dni, String nombre, String apellido1, String apellido2, String nacimiento, boolean reduccion) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacimiento = nacimiento;
        this.reduccion = reduccion;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
    
    
    
    public void imprimir(){
        
        System.out.println(codigo+". . ."+dni+". . ."+nombre+". . ."+apellido1+". . ."+apellido2+". . ."+nacimiento+". . ."+reduccion+". . .");
        
    }
    
    public String imprimir2(){
        return (codigo+". . ."+dni+". . ."+nombre+". . ."+apellido1+". . ."+apellido2+". . ."+nacimiento+". . ."+reduccion+". . .");
    }
}
