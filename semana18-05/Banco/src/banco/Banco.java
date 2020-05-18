/*
En un banco hay dos tipos de cuentas: cajas de ahorro y cuentas corrientes.
Programar una clase Cuenta y dos derivadas correspondientes a cada uno de los
tipos de cuenta.
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
Las cajas de ahorro no permiten extracciones si el saldo no es suficiente, mientras
que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible. La clase cuenta debe poseer al menos los atributos número,
nombre y saldo
 */
package banco;

/**
 *
 * @author Maka
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta ca = new CajaAhorro(1, "pepe", 100);
        Cuenta cc = new CuentaCorriente(-15, 2, "juan", 100);
        
        ca.depositar(100);
        ca.depositar(2);
        cc.depositar(150);
        cc.depositar(2);
        ca.extraer(201);
        ca.extraer(3);
        cc.extraer(267);
        cc.extraer(1);
    }
    
}
