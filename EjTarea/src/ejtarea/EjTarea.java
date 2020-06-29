package ejtarea;
import java.util.Scanner;
/**
 * @author Maka
 */
public class EjTarea {
    
    public static void main(String[] args) {
    // Una empresa de alquiler de autos cobra $300 por día si no se superan 
    //los 200 km de uso diario. Por cada km extra hasta los 1000 km cobra $5 
    //adicionales, y a partir de los 1000 cobra $10 adicionales. Hacer un 
    //programa que solicite la cantidad de km realizados por un cliente e 
    //indique el importe que se le debe cobrar.
        
        System.out.println("ingrese los kilometros recorridos");
        Scanner lector = new Scanner(System.in);
        int total = 0;
        int kilometros = lector.nextInt();
        if (kilometros <= 200) {
            total = 300;
        } else if (kilometros <= 1000) {
            total = 300 + ((kilometros-200) * 5);
        } else {
            total = 300 + ((kilometros-200) * 10);
        }
        System.out.println("El importe total es: "+total);
        
//Desarrollar un programa que permita ingresar la antigüedad los autos de una 
//concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada auto 
//ingresado mostrar por pantalla un mensaje adecuado con el siguiente criterio: 
//si el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, si tiene entre 6 
//y 10 mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si tiene más 
//de 20 “MUY ANTIGUO”.
//Luego de finalizada la carga calcular y mostrar los siguientes resultados:
//Cantidad total de autos.
//Cantidad de autos con poco uso.
//Promedio de antigüedad de los autos que no sean muy antiguos.
//        int antiguedad;
//        int cNuevo=0;
//        int aNuevo=0;
//        int cPoco=0;
//        int aPoco=0;
//        int cMucho=0;
//        int aMucho=0;
//        int c=0;
//        float promedio=0;
//        Scanner lector = new Scanner(System.in);
//        System.out.println("Concecionaria de Autos");
//        do {
//            c++;
//            System.out.println("Ingrese antiguedad en años: ");
//            antiguedad = lector.nextInt();
//            if (antiguedad >= 1 && antiguedad <= 5) {
//                System.out.println("NUEVO");
//                cNuevo++;
//                aNuevo += antiguedad;
//            } else if (antiguedad >= 6 && antiguedad <= 10) {
//                System.out.println("POCO USO");
//                cPoco++;
//                aPoco += antiguedad;
//            } else if (antiguedad >= 11 && antiguedad <= 20) {
//                System.out.println("MUCHO USO");
//                cMucho++;
//                aMucho += antiguedad;
//            } else if (antiguedad > 20) {
//                System.out.println("MUY ANTIGUO");
//            }
//            System.out.println("si desea finalizar ingrese 0");
//        } while (antiguedad != 0);
//        promedio = (float)(aNuevo + aPoco + aMucho) / (cNuevo + cPoco + cMucho);
//        System.out.println("cantidad total de autos: "+(c-1));
//        System.out.println("cantidad de autos con poco uso: "+cPoco);
//        System.out.println("promedio de antiguedad de autos que no sean muy antiguos: "+promedio);
//        System.out.println("fin");

    }

}
