/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresas;

/**
 *
 * @author CEEP
 */
public class Empleado {
    
    private int Dni;
    private String Name;
    private String PrimerApellido;
    private String SegundoApellido;
    private int Año;
    private Boolean ReduccionJornada;
    private String Sede;
    private String Departamento;

    
    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }


    /**
     * Get the value of Dni
     *
     * @return the value of Dni
     */
    public int getDni() {
        return Dni;
    }

    /**
     * Set the value of Dni
     *
     * @param Dni new value of Dni
     */
    public void setDni(int Dni) {
        this.Dni = Dni;
    }
    
    public Empleado(String NombreCompleto,int Dni,int Año,String Sede,String Departamento,int Reduccion){
    
        String[] NombreSeparado=NombreCompleto.split(" ");
        
        this.Name=NombreSeparado[0];
        this.PrimerApellido=NombreSeparado[1];
        this.SegundoApellido=NombreSeparado[2];
        this.Dni=Dni;
        this.Año=Año;
        this.Sede=Sede;
        this.Departamento=Departamento;
        
        if (Reduccion==1) {
                    this.ReduccionJornada=true;
        }
        else{
            this.ReduccionJornada=false;
        }
        

    }

    @Override
    public String toString() {
        return "Empleado{\b" + "Dni=" + Dni + ",\b Name=" + Name + ",\b PrimerApellido=" + PrimerApellido + ", \bSegundoApellido=" + SegundoApellido + ", \nA\u00f1o=" + Año + ",\n ReduccionJornada=" + ReduccionJornada + ",\nSede=" + Sede + ",\n Departamento=" + Departamento + '}';
    }

}
