/*
Las cajas de ahorro no permiten extracciones si el saldo no es suficiente, mientras
que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible.
 */
package banco;

/**
 *
 * @author Maka
 */
public class CajaAhorro extends Cuenta {

    public CajaAhorro(int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
    }
    
    @Override
    public void extraer(double importe){
        double nSaldo = getSaldo();
        if (nSaldo - importe < 0) {
            System.out.println("No puede retirar esa cantidad");
        } else {
            nSaldo -= importe;
            System.out.println("Su saldo actual es de: " + nSaldo);
        }
        super.setSaldo(nSaldo);
    }
    
}
