/*
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
 La clase cuenta debe poseer al menos los atributos número,
nombre y saldo
 */
package banco;

import java.nio.DoubleBuffer;

/**
 *
 * @author Maka
 */
public class Cuenta {
    private int numero;
    private String nombre;
    private double saldo;

    public Cuenta(int numero, String nombre, double saldo) { // ya no hay constructor vacio
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double importe){
        if(importe > 0){
            saldo += importe;
            System.out.println("Su saldo actual es de: " + saldo);
        }
    }
    
    public void extraer(double importe){
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    
    
    
}
