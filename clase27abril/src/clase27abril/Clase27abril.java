/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27abril;
import java.util.Scanner;
/**
 *
 * @author Maka
 */
public class Clase27abril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese una cantidad de personas: ");
        int cantidad = sc.nextInt();
        
        Persona [] personas = new Persona[cantidad];
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el peso de la persona " + (i+1));
            double peso = sc.nextDouble();
            personas[i]= new Persona(peso);
        }
        
        double acumPesos = 0;
        for (int i = 0; i < personas.length; i++) {
            acumPesos += personas[i].getPeso();
        }
        System.out.println("La suma de los pesos es: " + acumPesos);
        System.out.println("El promedio de los pesos es: " +acumPesos/personas.length);
        
        
//        System.out.println("Ingrese " + cantidad + " números: ");
//        int [] arregloPesos = new int [cantidad];
//
//        for (int i = 0; i < arregloPesos.length; i++) {
//            arregloPesos[i]= sc.nextInt();
//        }
//
//        int acumulador = 0;
//
//        for (int i = 0; i < arregloPesos.length; i++) {
//            acumulador += arregloPesos[i];
//        }
//        System.out.println(acumulador/arregloPesos.length);
//
//        System.out.println("");
    }
    
}
