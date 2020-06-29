/*
El ministerio de seguridad de la provincia de Córdoba nos solicita una aplicación con ventanas que permita
cargar las multas de la caminera. Se necesita registrar dni del conductor, nombre del conductor, patente
del auto, descripcion de la multa y monto de la multa. Cuando se realiza el pago voluntario por parte del
infractor la multa tiene un descuento del 50%. Realizar una pantalla de carga de multas y que la misma
permita abrir otra ventana con los siguientes reportes:
• Cantidad de multas que tuvieron pago voluntario y que dicho monto pagado sea mayor a $1000.
• Suma de monto pagado general
• Promedio de monto pagado por pago voluntario
 */
package repasoparcial1;
/**
 *
 * @author Maka
 */
public class Multa {
    private String descripcion;
    private float monto;
    private boolean pagoVoluntario;

    public Multa() {
    }

    public Multa(String descripcion, float monto, boolean pagoVoluntario) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.pagoVoluntario = pagoVoluntario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getMonto() {
        if (this.isPagoVoluntario()) {
            return (monto/2);
        } else {
            return monto;
        }
    }

    public boolean isPagoVoluntario() {
        return pagoVoluntario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setPagoVoluntario(boolean pagoVoluntario) {
        this.pagoVoluntario = pagoVoluntario;
    }

    @Override
    public String toString() {
        return "Multa{" + "descripcion=" + descripcion + ", monto=" + monto + ", pagoVoluntario=" + pagoVoluntario + '}';
    }

}
