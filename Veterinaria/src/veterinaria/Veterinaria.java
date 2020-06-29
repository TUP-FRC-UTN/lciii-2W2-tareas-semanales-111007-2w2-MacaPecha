/*
Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización 
de un software para obtener resultados sobre sus clientes y sus respectivas 
mascotas. (Suponer que cada cliente posee una sola mascota). Se sabe que cada 
Cliente de esta veterinaria tienen: un numero de cliente, un nombre, una 
antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota. De la
Mascota se dispone los siguientes datos: el nombre y la edad. El software 
requiere cargar un número n de Clientes (este valor deberá ser cargado por 
teclado). Almacenar la información de los clientes en un arreglo. 

Se pide: 
•Mostrar la cantidad de clientes. 
•Mostrar el promedio de edad de las mascotas. 
•Informar cuántos clientes tienen una antigüedad mayor igual a 5 años. 
 */
package veterinaria;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Maka
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Cliente [] clientes;
        Mascota mascotas;
        double acumEdad = 0;
        int countAntiguedad = 0;
        
        System.out.println("Ingrese la cantidad de clientes: ");
        int cantClientes = sc.nextInt();
        
        clientes = new Cliente[cantClientes];
        
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Ingrese el número del Cliente " + (i+1) + ":");
            int numero = sc.nextInt();
            
            sc.nextLine();
            System.out.println("Ingrese el nombre del Cliente:");
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese la antiguedad en años:");
            int antiguedad = sc.nextInt();
            
            sc.nextLine();
            System.out.println("Ingrese el nombre de la Mascota:");
            String nombreMascota = sc.nextLine();
            
            System.out.println("Ingrese la edad de la Mascota:");
            int edadMascota = sc.nextInt();
            acumEdad += edadMascota;
            
            mascotas = new Mascota(nombreMascota, edadMascota);
            clientes[i] = new Cliente(numero, nombre, antiguedad, mascotas);
            
            if (antiguedad >= 5) {
                countAntiguedad ++;
            }

        }
        
        //System.out.println("La cantidad de clientes es: " + clientes.length);// igual que la de abajo
        System.out.println("La cantidad de clientes es: " + cantClientes);
        System.out.println("El promedio de edades de las mascotas es: " + acumEdad/cantClientes);
        System.out.println("Cantidad de clientes con antiguedad mayor o igual a 5 años: " + countAntiguedad);
        System.out.println(Arrays.toString(clientes));
    }
}
