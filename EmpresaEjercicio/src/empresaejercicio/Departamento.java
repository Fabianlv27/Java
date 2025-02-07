
package empresaejercicio;


public class Departamento {
    String nombre;
    Empleado[] empleados = new Empleado[2];
    
    

    public String getNombre() {
        return nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        
        for(int i=0; i<empleados.length; i++){
            empleados[i] = new Empleado();
        }
        
        
    }
    
    
    
}
