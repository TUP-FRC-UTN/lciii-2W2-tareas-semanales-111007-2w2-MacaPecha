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
cuota por día. 
La municipalidad necesita un software que le permita registrar 
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
import java.util.Scanner;

/**
 *
 * @author Maka
 */
public class Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tamanio = 2; //cantidad de planes a cargar
        Municipalidad muni = new Municipalidad(tamanio);
        
        //carga de los datos por parte del usuario del plan1
        Plan plan1 = new Plan("christian", 1000, 3);
        Pago pago1 = new Pago(3,150,0.5);
        Pago pago2 = new Pago(2,150,0.5);
        Pago pago3 = new Pago(0,700,0.5);
        
        //agrego los 3 pagos al plan1
        plan1.agregarPago(pago1);//recibe el objeto pago como parametro
        plan1.agregarPago(pago2);
        plan1.agregarPago(pago3);
        
        //agregar el plan1 a la municipalidad
        muni.agregarPlan(plan1);//recibe el objeto plan como parametro
        
        //-----------------------------------------------------------------------------------
        //carga de los datos por parte del usuario del plan2
        Plan plan2 = new Plan("ana", 2000, 4);
        Pago pago21 = new Pago(2,500,0.5);
        Pago pago22 = new Pago(5,300,0.5);
        Pago pago23 = new Pago(1,700,0.5);
        Pago pago24 = new Pago(2,500,0.5);
        
        //agrego los 4 pagos al plan2
        plan2.agregarPago(pago21);//recibe el objeto pago como parametro
        plan2.agregarPago(pago22);
        plan2.agregarPago(pago23);
        plan2.agregarPago(pago24);
        
        //agregar el plan2 a la municipalidad
        muni.agregarPlan(plan2);//recibe el objeto plan como parametro
        
        //1
        System.out.println("1-La cantidad de planes pagados totalmente es de: " + muni.cantidadPlanesPagados());
        
        //2
        System.out.println("2-La sumatoria de todas las deudas registradas es: " + muni.sumatoriaDeuda());
        
        //3
        System.out.println("Ingrese un contribuyente: ");
        String nombre = sc.nextLine();
        System.out.println("3-El listado de todos los pagos efectuados por el contribuyente '"+ nombre +"' son: \n" + muni.listadoPagosContribuyente(nombre));
        
        //4
        System.out.println("4-El promedio de intereses pagados por los contribuyentes es: " + muni.promedioIntereses());
    
        
    }
    
}
