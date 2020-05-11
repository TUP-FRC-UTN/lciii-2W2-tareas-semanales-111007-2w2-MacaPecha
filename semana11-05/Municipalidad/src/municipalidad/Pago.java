/*
 
5.En una municipalidad otorgan planes de pagos a los contribuyentes que adeudan 
impuestos. De cada plan se conoce el nombre del contribuyente, el total de la 
deuda, la cantidad de cuotas y una lista de las cuotas pagadas. A su vez, cada 
vez que un deudor efectúa un pago se registran los datos correspondientes a la 
operación. De cada pago se conoce la demora, el importe pagado y el importe de 
intereses adicionales. Cuando el pago se realiza el día del vencimiento o antes, 
la demora equivale a 0 y en caso contrario a la cantidad de días transcurridos 
entre el vencimiento y el pago. Cuando el pago se realiza en fecha, no se cobran 
intereses adicionales, pero si hay demora se le cobra un 0,5 % del importe de la 
cuota por día. La municipalidad necesita un software que le permita registrar 
los datos de todos los planes emitidos y de los pagos recibidos. Asimismo el 
software debe poder calcular el importe de los intereses adicionales a partir 
de la cantidad de días de demora. Se debe desarrollar un programa en Java que 
solicite por teclado los datos de los planes y de los pagos y luego de 
finalizada la carga informe: 
•Cantidad de planes pagados en su totalidad (es decir, que tengan tantos pagos 
recibidos como la cantidad de cuotas pactadas) 
•Sumatoria de las deudas registradas 
•Listado de todos los pagos efectuados por un contribuyente en particular 
•Promedio general de intereses adicionales cobrados 

 */
package municipalidad;

/**
 *
 * @author Maka
 */
public class Pago {
    private int demora;
    private double importe;
    private double interesesAdicionales;

    public Pago(int demora, double importe, double interesesAdicionales) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }

    public int getDemora() {
        return demora;
    }

    public double getImporte() {
        return importe;
    }

    public double getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setInteresesAdicionales(double interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }

    @Override
    public String toString() {
        return "Pago{" + "demora=" + demora + ", importe=" + importe + ", interesesAdicionales=" + interesesAdicionales + '}';
    }
    
}
