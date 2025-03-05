/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceiling;

import java.util.Objects;

/**
 *
 * @author endga
 */
public class Personas  implements  Comparable<Personas>{
   private String Nombre;
   private String Apellido;
   private int Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
   
   public Personas(String Nombre,String Apellido,int Edad){
       this.Apellido=Apellido;
       this.Nombre=Nombre;
       this.Edad=Edad;
    
       
   }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + '}';
    }
  @Override
    public int hashCode() {
        return Objects.hash(Nombre, Apellido, Edad);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personas other = (Personas) obj;
        return Edad == other.Edad &&
               Objects.equals(Nombre, other.Nombre) &&
               Objects.equals(Apellido, other.Apellido);
    }
    
    @Override
    public int compareTo(Personas itr){
     int comp = this.Apellido.compareTo(itr.Apellido);
        if (comp == 0) {
            comp = this.Nombre.compareTo(itr.Nombre);
        }
        if (comp == 0) {
            comp = Integer.compare(this.Edad, itr.Edad);
        }
        return  comp;
    }
      
    
}
