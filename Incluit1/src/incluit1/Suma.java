package incluit1;

/**
 *
 * @author Maka
 */
public class Suma extends Operacion{ //recibe tipo numero

    public Suma(Termino izquierda, Termino derecha) {
        super(izquierda, derecha);
    }
    
    public int valuar() {
        int valorIzq = izquierda.valuar();
        int valorDer = derecha.valuar();
        
        return valorIzq + valorDer;
    }
}
