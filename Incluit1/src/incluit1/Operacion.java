package incluit1;

/**
 *
 * @author Maka
 */
public abstract class Operacion implements Termino {
    protected Termino izquierda;
    protected Termino derecha;

    public Operacion(Termino izquierda, Termino derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    
}
