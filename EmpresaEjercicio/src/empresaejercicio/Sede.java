
package empresaejercicio;


public class Sede {
    
    String ubicacion;
    Departamento[] departamentos = new Departamento[3];

    
    public Sede(String nombre) {
        
        this.ubicacion = nombre;
        departamentos[0] = new Departamento("Ventas");
        departamentos[1] = new Departamento("RR.HH");
        departamentos[2] = new Departamento("Produccion");
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }
    
    
}


