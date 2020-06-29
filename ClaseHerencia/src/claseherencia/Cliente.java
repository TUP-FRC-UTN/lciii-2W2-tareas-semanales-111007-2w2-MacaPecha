/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseherencia;

/**
 *
 * @author Maka
 */
public class Cliente {
    private int numero;
    private String nombre;
    private String telefono;

    public Cliente(int numero, String nombre, String telefono) { //ya no hay constructor vacio
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCliente{" + "numero=" + numero + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
}
