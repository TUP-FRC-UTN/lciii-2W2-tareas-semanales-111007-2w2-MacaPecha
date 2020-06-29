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
public class Departamento extends Propiedad {
    private double expensas;

    public Departamento(String direccion, int cantidadHabitaciones, double precio, boolean usoComercial, int cantidadInquilinos, double expensas) {
        super(direccion, cantidadHabitaciones, precio, usoComercial, cantidadInquilinos);
        this.expensas = expensas;
    }

    @Override
    public double precioalquiler() {
        double precio = getPrecio() + this.expensas;
        if(isUsoComercial()) precio += 500;
        return precio;
    }    
    
    @Override
    public String toString() {
        return "Departamento: Direccion: " + getDireccion();
    }
}
