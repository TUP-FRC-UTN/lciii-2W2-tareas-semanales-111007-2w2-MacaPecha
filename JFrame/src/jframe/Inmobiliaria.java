/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.util.ArrayList;

/**
 *
 * @author Maka
 */
public class Inmobiliaria {
    private ArrayList<Propiedad> propiedades; // arreglo dinamico con objetos de tipo Propiedad

    public Inmobiliaria() {
        propiedades = new ArrayList(); // inicializado, se crea el objeto, en este caso no se define tamaño
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }
    
    public void agregarPropiedad(Propiedad p){
        propiedades.add(p); // eso es todo para agregar al arrayList, al final de la coleccion
    }
    
    public double promedioAlquileres(){
        double acumulador = 0;
        int contador = 0;
        for (Propiedad propiedad : propiedades) {
            if(propiedad.getCantidadInquilinos() == 2){
                acumulador += propiedad.precioalquiler();//en vez de usar getPrecio()
                contador++;
            }
        }
        if(contador==0){
            return 0;
        }else{
            return acumulador/contador;
        }
    }
    
    public int cantidadTresoMas(){
        int contador = 0;
        for (Propiedad propiedad : propiedades) {
            if(propiedad instanceof Casa){
                if(propiedad.getCantidadHabitaciones() >= 3 && ((Casa)propiedad).isGaraje()){
                    contador++;
                }
            }
        }
        return contador;
    }
}
