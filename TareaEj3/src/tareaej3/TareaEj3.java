package tareaej3;
import java.util.Scanner;
/**
 *
 * @author Maka
 */
public class TareaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  3.Hacer un programa que ingrese los datos de una factura en la 
//  cual haya tres artículos vendidos. De cada artículo ingresar el 
//  precio unitario y la cantidad. Finalmente imprimir el 
//  total de la factura 
    Scanner sc = new Scanner (System.in);
    int cont = 0;
    double acum = 0;
    int c = 3;
        for (int i = 0; i < c; i++) {
            System.out.println("Artículo " + (i+1));
            System.out.println("Ingrese el precio");
            double precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad");
            int cantidad = sc.nextInt();
            Articulo a = new Articulo(precio, cantidad);
            System.out.println(a);
            acum = acum + (precio * cantidad);
        }
        
        System.out.println("El total de la factura es: " + acum/c);




//  5.Ingresar la cantidad de horas trabajadas por un empleado y el 
//  sueldo que cobra por hora. Indique el total a cobrar teniendo 
//  en cuenta que si trabajó más de 180 horas las 
//  excedentes las cobra con un 50 % de aumento. 
    }
    
}
