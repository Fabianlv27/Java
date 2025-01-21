/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicacion;

/**
 *
 * @author CEEP
 */
public class Persona {
        private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persona() {
    }

    public Persona(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + '}';
    }
    
}
