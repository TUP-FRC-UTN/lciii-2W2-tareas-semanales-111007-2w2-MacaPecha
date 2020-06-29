/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

/**
 *
 * @author Maka
 */
public class Casa extends Propiedad {
    private boolean garaje;

    public Casa(String direccion, int cantidadHabitaciones, double precio, boolean usoComercial, int cantidadInquilinos, boolean garaje) {
        super(direccion, cantidadHabitaciones, precio, usoComercial, cantidadInquilinos);
        this.garaje = garaje;
    }

    public boolean isGaraje() {
        return garaje;
    }
    
    @Override
    public double precioalquiler() {
        double precio = getPrecio();
        if(isUsoComercial()) precio += 1000;
        return precio;
    }

    @Override
    public String toString() {
        return "Casa: Direccion: " + getDireccion();
    }
    
    
    
}
