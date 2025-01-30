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

}
