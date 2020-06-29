/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

/**
 *
 * @author usuario
 */
public class Socio {
    
    private int documento;
    private String nombre;
    private int cuota;
    private int adicionales;

    public Socio(int documento, String nombre, int cuota, int adicionales) {
        this.documento = documento;
        this.nombre = nombre;
        this.cuota = cuota;
        this.adicionales = adicionales;
    }

    public int getCuota() {
        return cuota;
    }

    public int getAdicionales() {
        return adicionales;
    }

    @Override
    public String toString() {
        String cuota="";
        switch (this.cuota){
            case 1000: 
                cuota = "Basica";
                break;
            case 1500: 
                cuota = "Mejorada";
                break;
            case 2300: 
                cuota = "Full";
                break;
        }
        return "documento:" + documento + ", nombre:" + nombre + ", cuota:" + cuota + ", adicionales:" + adicionales;
    }
    
    
    
}
