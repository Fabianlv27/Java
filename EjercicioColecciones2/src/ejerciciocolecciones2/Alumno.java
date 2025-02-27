/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocolecciones2;

import java.util.Objects;

/**
 *
 * @author CEEP
 */
public class Alumno {
  private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Nacionalidad;
    
    public Alumno(String Nombre,String Apellido1,String Apellido2,String Nacionalidad){
    this.Nombre=Nombre;
    this.Apellido1=Apellido1;
    this.Apellido2=Apellido2;
    this.Nacionalidad=Nacionalidad;

}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    public void Show(){
        System.out.println(Nombre+ "\t\t"+Apellido1+ "\t\t"+Apellido2+ "\t\t"+Nacionalidad+ "\n");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Nombre);
        hash = 41 * hash + Objects.hashCode(this.Apellido1);
        hash = 41 * hash + Objects.hashCode(this.Apellido2);
        hash = 41 * hash + Objects.hashCode(this.Nacionalidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Apellido1, other.Apellido1)) {
            return false;
        }
        if (!Objects.equals(this.Apellido2, other.Apellido2)) {
            return false;
        }
        return Objects.equals(this.Nacionalidad, other.Nacionalidad);
    }
    
      
}
