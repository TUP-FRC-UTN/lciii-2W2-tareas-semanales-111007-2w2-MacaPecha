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
public class Municipalidad {
    private Plan [] planes;
    
    public Municipalidad(int tamanio){
        planes = new Plan[tamanio];//dimensiono e inicializo el array de planes
    }
    
    //si no inicializo plan en el contructor esto se rompe
    public void agregarPlan(Plan plan){
        // importante usar el length porque ya no tenemos mas a tamanio
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                planes[i] = plan;
                break; // sin el break se llenan todos los indices del vector 
                //con el mismo parametro
            }
        }
    }
    
    public int cantidadPlanesPagados(){
        int planesPagados = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null && planes[i].estaPagadoTotalmente()) {
                planesPagados ++;
            }
        }
        return planesPagados;
    }
    
    public double sumatoriaDeuda() {
        double totalSumatoria = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                totalSumatoria += planes[i].sumaInteresesCobrados();
            }
        }
        return totalSumatoria;
    }
    
    public String listadoPagosContribuyente(String nombre) {
        String lista = "";
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null && (planes[i].getNombreContribuyente().equals(nombre))) {
                lista = planes[i].listadoPagos();
                break; //importante!!!
            } else {
                lista= "El contribuyente "+nombre+" no tiene un plan registrado!";
            }
        }
        return lista;
    }
    
    public double promedioIntereses() {
        double totalIntereses = 0; 
        int contPlanes = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                //acumulador del acumulador
                totalIntereses += planes[i].sumaInteresesCobrados();
                contPlanes++;
            }
        }
        // total acumulado / cantidad de elementos
        if (contPlanes == 0) {
            return 0;
        } else {
            return totalIntereses / contPlanes; //si no hubo ningun pago con demora da cero
        }
    }

}
