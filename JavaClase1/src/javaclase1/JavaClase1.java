package javaclase1;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author Maka
 */
public class JavaClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;
        float precio, subtotal, total;
        
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        
        total = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Datos del articulo "+ (i+1));
            System.out.println("Precio: ");
            precio = scanner.nextFloat();
            
            System.out.println("Cantidad: ");
            cantidad = scanner.nextInt();
            
            subtotal = precio*cantidad;
            total += subtotal;
        }
        
        scanner.close();
        System.out.println("El total es: " + total);
        
    }
    
}
