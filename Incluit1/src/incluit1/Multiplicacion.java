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
public class Multiplicacion extends Operacion {

    public Multiplicacion(Termino izquierda, Termino derecha) {
        super(izquierda, derecha);
    }
    @Override
    public int valuar() {
        return izquierda.valuar() * derecha.valuar();
    }
}

