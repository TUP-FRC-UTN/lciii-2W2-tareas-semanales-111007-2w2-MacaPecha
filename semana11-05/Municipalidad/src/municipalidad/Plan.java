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

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.Arrays;

/**
 *
 * @author Maka
 */
public class Plan {
    private String nombreContribuyente;
    private double deuda;
    private int cuotas;//tamaño maximo de array de pagos
    private Pago [] pagos;

    public Plan(String nombreContribuyente, double deuda, int cuotas) {
        this.nombreContribuyente = nombreContribuyente;
        this.deuda = deuda;
        this.cuotas = cuotas;
        pagos = new Pago[cuotas];//dimensiono e inicializo el array de pagos
    }//no incluir pagos en el constructor

    public String getNombreContribuyente() {
        return nombreContribuyente;
    }

    public double getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setNombreContribuyente(String nombreContribuyente) {
        this.nombreContribuyente = nombreContribuyente;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Plan{" + "nombreContribuyente=" + nombreContribuyente + ", deuda=" + deuda + ", cantCoutas=" + cuotas + ", pagos=" + pagos + '}';
    }
    //si no inicializo pagos en el contructor esto se rompe
    public void agregarPago(Pago pago){
        // importante usar el length porque ya no tenemos mas a cantCoutas
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = pago;
                break; // sin el break se llenan todos los indices del vector 
                //con el mismo parametro
            }
        }
    }
    
    public boolean estaPagadoTotalmente() {
        boolean estaPago = true;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                estaPago = false;
                break; // para no hacer vueltas de mas
            }
        }
        return estaPago;
    }
    
    public String listadoPagos() {
        String lista = "";
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                lista += pagos[i].toString() + "\n";
            }
        }
        return lista;
    }
    
    public double sumaInteresesCobrados() {
        double sumaIntereses = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                if(pagos[i].getDemora() > 0) {
                    sumaIntereses += pagos[i].getDemora() * pagos[i].getInteresesAdicionales() * pagos[i].getImporte();
                }
            }
        }
    return sumaIntereses; //si no hubo ningun pago con demora da cero
    }
    
}
