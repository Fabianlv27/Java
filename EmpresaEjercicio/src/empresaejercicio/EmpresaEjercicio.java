
package empresaejercicio;

import java.util.Arrays;
import java.util.Scanner;


public class EmpresaEjercicio {

    
    public static void main(String[] args) {
        
        Sede Madrid = new Sede("Madrid");
        Sede Barcelona = new Sede("Barcelona");
        Sede Valencia = new Sede("Valecia");
        Sede Oviedo = new Sede("Oviedo");
        
        //System.out.println(Madrid.getDepartamentos()[1].getEmpleados()[2].nacimiento);
        
        Sede[] sedes = {Madrid,Barcelona,Valencia,Oviedo};
        
        menu(sedes);
        
        
    }
    
    public static void menu(Sede[] sedes){
        int opc_sede=0;
        
        do{
            Scanner s = new Scanner(System.in);
            
            limpiar();
            System.out.println("╔════════════════════════════════╗");
            System.out.println("       BIENVENIDO AL         ");
            System.out.println("    GESTOR DE EMPLEADOS        ");
            System.out.println("╚════════════════════════════════╝");

            System.out.println("  ☆ Elige una sede. ☆");
            System.out.println("1. MADRID");
            System.out.println("2. BARCELONA");
            System.out.println("3. VALENCIA");
            System.out.println("4. OVIEDO");
            System.out.println("5. SALIR");

            System.out.print("☆: ");

            opc_sede = s.nextInt();
            
            
            
            switch(opc_sede){
                case 1:
                    menu_departamento(sedes, opc_sede);
                    break;

                case 2:
                    menu_departamento(sedes, opc_sede);
                    break;

                case 3:
                    menu_departamento(sedes, opc_sede);
                    break;

                case 4:
                    menu_departamento(sedes, opc_sede);
                    break;

                case 5:
                    break;

                default:
                    break;

            }
        }while(opc_sede != 5);
        
        
        
        
    }
    
    public static void menu_departamento(Sede[] sedes, int opc_sede){
        Scanner w = new Scanner(System.in);
        String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Oviedo"};
        int opc_depar;
        limpiar();
        System.out.println("╔════════════════════════════════╗");
        System.out.println("          SEDE DE           ");
        System.out.println("         "+ciudades[opc_sede-1].toUpperCase()+"       ");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("  ☆ Elige un departamento: ☆");
        System.out.println("1. VENTAS");
        System.out.println("2. RR.HH");
        System.out.println("3. PRODUCCION");
        
        System.out.print("☆: ");
        opc_depar = w.nextInt();
        
        switch(opc_depar){
                case 1:
                    menu_empleado(sedes, opc_sede, opc_depar);
                    break;

                case 2:
                    menu_empleado(sedes, opc_sede, opc_depar);
                    break;

                case 3:
                    menu_empleado(sedes, opc_sede, opc_depar);
                    break;

                case 4:
                    menu_empleado(sedes, opc_sede, opc_depar);
                    break;
        
        }
    }
    
    public static void menu_empleado(Sede[] sedes, int opc_sede, int opc_depar){
        Scanner p = new Scanner(System.in);
        
        String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Oviedo"};
        String[] departs = {"VENTAS", "RR.HH", "PRODUCCION"};
        
        limpiar();
        System.out.println("╔════════════════════════════════╗");
        System.out.println("    SEDE DE "+ciudades[opc_sede-1].toUpperCase()+"         ");
        System.out.println("  DEPARTAMENTO DE "+departs[opc_depar-1]+"            ");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("  ☆ Que accion quieres realizar: ☆");
        System.out.println("1. VER LISTADO EMPLEADOS");
        System.out.println("2. ANADIR EMPLEADO");
        System.out.println("3. ELIMINAR EMPLEADO");
        System.out.println("4. VOLVER AL INICIO");
        
        System.out.print("☆: ");
        int accion = p.nextInt();
        
        switch(accion){
                case 1:
                    verLista(sedes,opc_sede,opc_depar);
                    break;

                case 2:
                    anadirEmpleado(sedes,opc_sede,opc_depar);
                    break;

                case 3:
                    elimEmpleado(sedes,opc_sede,opc_depar);
                    break;

                case 4:
                    break;
        
        }
        
    }
    
    public static void verLista(Sede[] sedes, int opc_sede, int opc_depar){
        
        Scanner s = new Scanner(System.in);
        
        limpiar();
        
        for(int i=0; i<sedes[opc_sede-1].getDepartamentos()[opc_depar-1].getEmpleados().length; i++){
            
            sedes[opc_sede-1].getDepartamentos()[opc_depar-1].getEmpleados()[i].imprimir();
        }
        
        System.out.println("\n--Introduce 1 para volver al menu anterior.\n--Introduce 2 para volver al incio\n--Introduce otro numero para salir.");
        System.out.print("☆: ");
        int opp = s.nextInt();
        
        if(opp==1){
            menu_empleado(sedes,opc_sede,opc_depar);
        
        }
        else if(opp==2){
            limpiar();
        }
        else{
           System.exit(0);
        }
        
    }
    
    public static void anadirEmpleado(Sede[] sedes, int opc_sede, int opc_depar){
        Scanner s  = new Scanner(System.in);
        
        System.out.print("\nCodigo empleado: ");
        int codigo = s.nextInt();
        
        s.nextLine();
        System.out.print("\nDNI: ");
        String dni = s.nextLine();
        
        System.out.print("\nNombre: ");
        String nombre = s.nextLine();
        
        System.out.print("\nPrimer Apellido: ");
        String apellido1 = s.nextLine();
        
        System.out.print("\nSegundo Apellido: ");
        String apellido2 = s.nextLine();
        
        System.out.print("\nNacimiento: ");
        String nacimiento = s.nextLine();
        
        System.out.print("\nReduccion: ");
        Boolean reduccion = s.nextBoolean();
        
        //CREAMOS EL NUEVO OBJETO
        Empleado empleadoNuevo = new Empleado(codigo,dni,nombre,apellido1,apellido2,nacimiento,reduccion); 
        //CREAMOS NUEVO ARRAY QUE REFERENCIA A LOS EMPLEADOS DE ESTE DEPARTAMENTO Y SEDE PARA TRABAJAR CON EL (SHALLOW)
        Empleado[] arrayUso = sedes[opc_sede-1].getDepartamentos()[opc_depar-1].getEmpleados();
        
        //LE AÑADIMOS UNA POSICION Y LA IGUALAMOS AL NUEVO OBJETO
        arrayUso = Arrays.copyOf(arrayUso, arrayUso.length+1);
        arrayUso[arrayUso.length-1] = empleadoNuevo;
        
        //AÑADIMOS EL NUEVO ARRAY DE EMPLEADOS ALOBJETO INICIAL CON EL setEmpleados
        sedes[opc_sede-1].getDepartamentos()[opc_depar-1].setEmpleados(arrayUso);
        
        System.out.println("\n--Introduce 1 para volver al menu anterior.\n--Introduce 2 para volver al incio\n--Introduce otro numero para salir.");
        System.out.print("☆: ");
        int oppp = s.nextInt();
        
        switch(oppp){
            case 1:
                menu_empleado(sedes,opc_sede,opc_depar);
                break;
                
            case 2:
                limpiar();
                break;
                
            default:
                System.exit(0);
                break;
        }
        
        
    }
    
    public static void elimEmpleado(Sede[] sedes, int opc_sede, int opc_depar){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el codigo del empleado que quieres eliminar: ");
        int codigo = s.nextInt();
        int posicion_borrado=-1;
        
        Empleado[] arrayNuevo = sedes[opc_sede-1].getDepartamentos()[opc_depar-1].getEmpleados();
        
        
        
        for(int i=0; i<arrayNuevo.length; i++){
            
            if(arrayNuevo[i].getCodigo()==codigo){
                posicion_borrado = i;
            }
        }
        
        Empleado[] arrayDefi = new Empleado[arrayNuevo.length-1];
        
        if(posicion_borrado != -1){
            
            System.arraycopy(arrayNuevo, 0, arrayDefi, 0, posicion_borrado);
            
            System.arraycopy(arrayNuevo, posicion_borrado+1, arrayDefi, posicion_borrado, arrayDefi.length-posicion_borrado);
        }else{
            System.out.println("¡¡¡CODIGO INEXISTENTE!!!");
            elimEmpleado(sedes,opc_sede,opc_depar);
            
        }
        
        sedes[opc_sede-1].getDepartamentos()[opc_depar-1].setEmpleados(arrayDefi);
        
        System.out.println("¡Eliminado con exito!");
        System.out.println("\n--Introduce 1 para volver al menu anterior.\n--Introduce 2 para volver al incio\n--Introduce otro numero para salir.");
        System.out.print("☆: ");
        int oppp = s.nextInt();
        
        switch(oppp){
            case 1:
                menu_empleado(sedes,opc_sede,opc_depar);
                break;
                
            case 2:
                limpiar();
                break;
                
            default:
                System.exit(0);
                break;
        }
        
    }
    
    
    public static void limpiar(){
        for(int i=0; i<50; i++){
            System.out.println("");
        }
    }
    
}
