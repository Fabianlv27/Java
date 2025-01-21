/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.animales;
//meter los tres en el array y visualizarlo , decir el mas joven y hacer la media
/**
 *
 * @author CEEP
 */
public class EjerciciosAnimales {

    public static void Ejercicio1(){
        int Min=1000;
        double T_edad=0;
        int C_animal=0;
            Animal[] Animales=new Animal[3];
            
            Animales[0]=new Perro("Max","Rojo");
            Animales[1]=new Gato("Oscar","Morado");
            Animales[2]=new Gato("Oscar","rgb(25,25,25)");
            
            for (int i = 0; i < Animales.length; i++) {
                T_edad+= Animales[i].GetEdad();
                C_animal++;
                if (Animales[i].GetEdad()<Min) {
                    Min=Animales[i].GetEdad();
                }
                System.out.println(Animales[i]);
        }
            System.out.println("La media es: " +  T_edad/C_animal);
            System.out.println("El animal mas joven tiene " + Min);
    }
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
Ejercicio1();
    }
}
