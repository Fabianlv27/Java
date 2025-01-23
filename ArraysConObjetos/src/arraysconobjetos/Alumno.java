/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysconobjetos;

/**
 *
 * @author endga
 */
public class Alumno {
    private  String Nombre;
    private  int Nota;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }
public Alumno(String Nombre,int Nota){
this.Nombre=Nombre;
this.Nota=Nota;

}
    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Nota=" + Nota + '}';
    }
    
}
