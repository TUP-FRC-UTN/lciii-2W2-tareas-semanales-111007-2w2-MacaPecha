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
import java.util.Scanner;
/**
 *
 * @author Maka
 */
public class RepasoParcial1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Caminera \n");
        int dni = 0;
        String nombre = "";
        int cantidadMultas = 0;
        String patente = "";
        
        boolean checkDNI = true;
        while (checkDNI) {
            System.out.println("Ingrese DNI del conductor: ");
            String input = sc.nextLine();
            try {
              int x = Integer.parseInt(input); 
              dni = x;
              checkDNI = false;
            }catch(NumberFormatException e) {
              System.out.println("El DNI debe ser un número!"); 
            } 
        }
        
        boolean checkNombre = true;
        System.out.println("Ingrese Nombre del Conductor: ");
        nombre = sc.nextLine();
        while(checkNombre){
            if("".equals(nombre)){
                System.out.println("Debe ingresar un nombre!");
                System.out.println("Ingrese Nombre del Conductor: ");
                nombre = sc.nextLine();
            } else {
                checkNombre = false;
            }
        }
        
        boolean checkPatente = true;
        System.out.println("Ingrese patente del conductor: ");
        patente = sc.nextLine();
        while(checkPatente){
            if("".equals(patente)){
                System.out.println("Debe ingresar una patente!");
                System.out.println("Ingrese patente del conductor: ");
                patente = sc.nextLine();
            } else {
                checkPatente = false;
            }
        }
        
        boolean checkCantidad = true;
        while (checkCantidad) {
            System.out.println("Ingrese cantidad de multas: ");
            String input = sc.nextLine();
            try {
              int x = Integer.parseInt(input);
              cantidadMultas = x;
              checkCantidad = false;
            }catch(NumberFormatException e) {
              System.out.println("La cantidad debe ser un Número!"); 
            } 
        }
        
        Conductor c = new Conductor(dni, nombre, patente, cantidadMultas);
        
        System.out.println("INGRESE CADA UNA DE LAS " + cantidadMultas + " MULTAS");
        
        for (int i = 0; i < cantidadMultas; i++) {
            String descripcion = "";
            float monto = 0;
            boolean pagoVoluntario = false;
            
            boolean checkDescripcion = true;
            System.out.println("Ingrese descripcion de la multa " + (i+1) + ": ");
            descripcion = sc.nextLine();
            while(checkDescripcion){
                if("".equals(descripcion)){
                    System.out.println("Debe ingresar una descripcion!");
                    System.out.println("Ingrese descripcion de la multa " + (i+1) + ": ");
                    descripcion = sc.nextLine();
                } else {
                    checkDescripcion = false;
                }
            }
            
            boolean checkMonto = true;
            while (checkMonto) {
                System.out.println("Ingrese el monto de la multa " + (i+1) + ": ");
                String input = sc.nextLine();
                try {
                  float x = Float.parseFloat(input);
                  monto = x;
                  checkMonto = false;
                }catch(NumberFormatException e) {
                  System.out.println("El monto debe ser un Número!"); 
                } 
            }
           
            boolean quit = true;
            OUTER:
            while (quit) {
                System.out.println("El pago de la multa " + (i+1) + " es voluntario? (ingrese \"s\" para SI y \"n\" para NO)");
                String userInput = sc.next().toLowerCase();
                switch (userInput) {
                    case "s":
                        pagoVoluntario = true;
                        quit = false;
                        break OUTER;
                    case "n":
                        pagoVoluntario = false;
                        quit = false;
                        break OUTER;
                    default:
                        System.out.println("Responda S o N");
                        break;
                }
            }
            
            Multa m = new Multa(descripcion, monto, pagoVoluntario);
            c.agregarMulta(m);
            sc.nextLine();
        }
        
        System.out.println("Cantidad de multas que tuvieron pago voluntario y que dicho monto pagado sea mayor a $1000: " + c.cantidadMultasPagoVoluntarioMayor1000());
        System.out.println("Suma de monto pagado general: " + c.montoGeneral());
        System.out.println("Promedio de monto pagado por pago voluntario: " + c.promedioMontoPagoVoluntario());
    }
}
