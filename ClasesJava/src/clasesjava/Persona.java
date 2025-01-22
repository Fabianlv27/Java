/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesjava;

/**
 *
 * @author CEEP
 */
public class Persona {

    //Atributos y propiedades
   private  String nombre;
    private  String  apellido;
    private  String  genero ;
    private  int edad ;
    private boolean Jubilar;

    public String Gustos;

    /**
     * Get the value of Gustos
     *
     * @return the value of Gustos
     */


    /**
     * Get the value of Jubilar
     *
     * @return the value of Jubilar
     */
    public boolean isJubilar() {
        return Jubilar;
    }

    /**
     * Set the value of Jubilar
     *
     * @param Jubilar new value of Jubilar
     */
    public void setJubilar(boolean Jubilar) {
        this.Jubilar = Jubilar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Persona(){
        //Vacio
    }
    //Constructores
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public Persona(boolean Jubilar) {
        this.Jubilar = Jubilar;
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }
    

  //generar un metodo en el que cuando yo meto la edad de la persona que ponga flaso si la edad es menor que 65 

    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        if (edad>=65) {
            this.Jubilar=true;
        }else{
            this.Jubilar=false;
        }
    }

    @Override
    public String toString() {
        return "\nPersona{ \n" + "nombre=" + nombre + ",\n apellido=" + apellido + ",\n genero=" + genero + ", \n edad=" + edad + ", \nJubilar=" + Jubilar + ",\n Gustos=" + Gustos + "}\n";
    }

   
}
