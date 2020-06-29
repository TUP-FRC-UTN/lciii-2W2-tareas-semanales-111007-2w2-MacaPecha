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
public class ClientePreferencial extends Cliente { //es un cliente
    private double saldo;
    private double limite; //saldo limite
    private String domicilio;

    public ClientePreferencial(double saldo, double limite, String domicilio, int numero, String nombre, String telefono) {
        super(numero, nombre, telefono);// clase heredada anterior
        this.saldo = saldo;
        this.limite = limite;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClientePreferencial{" + "saldo=" + saldo + ", limite=" + limite + ", domicilio=" + domicilio + '}';
    }

}
