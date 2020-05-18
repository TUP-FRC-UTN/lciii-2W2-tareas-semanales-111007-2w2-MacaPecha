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
public class CuentaCorriente extends Cuenta {
    private double acuerdo;

    public CuentaCorriente(double acuerdo, int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }
    
    @Override
    public void extraer(double importe){
        if (saldo - importe < acuerdo) {
            System.out.println("No puede retirar esa cantidad porque supera su acuerdo de saldo negativo");
        } else {
            saldo -= importe;
            System.out.println("Su saldo actual es de: " + saldo);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" + "acuerdo=" + acuerdo + '}';
    }

}
