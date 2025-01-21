/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.animales;
import java.util.Scanner;

//Emitir sonidos, envejecer, cambiar color
/**
 *
 * @author CEEP
 */
abstract class Animal {
    
static Scanner dato=new Scanner(System.in);

 private String nombre;
    private String color;
    private int edad;
//es abstrapto porque se va a modificar por cada clase
    abstract void HacerSonido();
    
    public Animal() {
    }
    //Geters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String GetColor() {
        return color;
    }

    public int GetEdad() {
        return edad;
    }

    //Seters
   

    public void SetColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Constructores
 

    public Animal(int edad) {
        this.edad = edad;
    }

 public Animal(String nombre,String color){
     this.color=color;
     this.nombre=nombre;
     System.out.println("Ingrese la edad");
     this.edad=  dato.nextInt();
 }

    public Animal(int edad,String color){
        this.color=color;
        this.edad=edad;
        this.nombre="ave";
    }
    
      public Animal(String color,int edad){
        this.edad=edad;
        this.color=color;
    }
     
      //Metodos 

    @Override
    public String toString() {
        return "Animal{" + "\n nombre=" + nombre + ", \ncolor=" + color + ", \nedad=" + edad + "\n"+ '}';
    }



    
}
class Perro extends Animal{
    public Perro(String nombre,String color){
    super(nombre,color);
    
    }
    @Override
    void HacerSonido(){
        System.out.println("|Guau Guau!");
    }
}
class Gato extends Animal{
    public Gato(String nombre,String color){
    super(nombre,color);
    }
       @Override
    void HacerSonido(){
        System.out.println("|Miau!");
    }
}
class Ave extends Animal{
    public Ave(String nombre,String color){
    super(nombre,color);
    }
       @Override
    void HacerSonido(){
        System.out.println("|pi pi pi!");
    }
}


