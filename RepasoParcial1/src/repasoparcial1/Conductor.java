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
public class Conductor {
    private int DNI;
    private String nombre;
    private String patente;
    private Multa [] multa;

    public Conductor() {
    }

    public Conductor(int DNI, String nombre, String patente, int cantidadMultas) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.patente = patente;
        multa = new Multa[cantidadMultas]; // inicializo el array Material
    }
    
    public void agregarMulta(Multa multa){
        for (int i = 0; i < this.multa.length; i++) {
            if (this.multa[i] == null) { // en el unico que hay que poner condicion == null para cargar
                this.multa[i] = multa;
                break; //importante!!
            }
        }
    }
    
    public int cantidadMultasPagoVoluntarioMayor1000(){
        int cantidad = 0;
        for (int i = 0; i < this.multa.length; i++) {
            if (this.multa[i] != null && this.multa[i].isPagoVoluntario() && this.multa[i].getMonto() > 1000) {
                cantidad ++;
            }
        }
        return cantidad;
    }
    
    public float promedioMontoPagoVoluntario(){
        int contador = 0;
        float acumulador = 0;
        for (int i = 0; i < this.multa.length; i++) {
            if (this.multa[i] != null && this.multa[i].isPagoVoluntario()) {
                acumulador += this.multa[i].getMonto();
                contador ++;
            }
        }
        return (acumulador/contador);
    }
    
    public float montoGeneral(){
        float total = 0;
        for (int i = 0; i < this.multa.length; i++) {
            if (this.multa[i] != null) {
                total += this.multa[i].getMonto();
            }
        }
        return total;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPatente() {
        return patente;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Conductor{" + "DNI=" + DNI + ", nombre=" + nombre + ", patente=" + patente + ", multa=" + multa + '}';
    }
    
}
