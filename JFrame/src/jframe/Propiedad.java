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
public abstract class Propiedad {
    private String direccion;
    private int cantidadHabitaciones;
    private double precio;
    private boolean usoComercial;
    private int cantidadInquilinos;

    public Propiedad(String direccion, int cantidadHabitaciones, double precio, boolean usoComercial, int cantidadInquilinos) {
        this.direccion = direccion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precio = precio;
        this.usoComercial = usoComercial;
        this.cantidadInquilinos = cantidadInquilinos;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public int getCantidadInquilinos() {
        return cantidadInquilinos;
    }
    
    public abstract double precioalquiler();//obligo a las hijas a implementarlo
    
    @Override
    public String toString() {
        return "Propiedad{" + "direccion=" + direccion + ", cantidadHabitaciones=" + cantidadHabitaciones + ", precio=" + precio + ", usoComercial=" + usoComercial + ", cantidadInquilinos=" + cantidadInquilinos + '}';
    }
    
}
