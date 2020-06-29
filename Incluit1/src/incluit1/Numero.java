/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incluit1;

/**
 *
 * @author Maka
 */
public abstract class Numero implements Termino{
    private int valor;

    public int getValor() {
        return valor;
    }

    public Numero(int valor) {
        this.valor = valor;
    }
    
    
}
