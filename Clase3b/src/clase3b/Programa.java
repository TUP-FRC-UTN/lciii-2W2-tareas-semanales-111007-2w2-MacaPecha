package clase3b;
import java.util.Scanner;
/**
 *
 * @author Maka
 */
public class Programa {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p;
        p = new Persona("Maka", "Pecha", 38161112, 160, 60.5);
        System.out.println(p);
        Persona q = new Persona();
        q.setNombre("Michi");
        q.setApellido("Mi Gato");
        q.setDni(123456);
        q.setPeso(60.2);
        q.setAltura(200);
        System.out.println(q);
        Persona clon = p;
        clon.setApellido("cambio");
        System.out.println(q.getNombre());
        System.out.println(q.getApellido());
        System.out.println(q.getDni());
        System.out.println(p);
        System.out.println(clon);
        
//        Persona p2 = new Persona("Alan", "Iberra", 35175385);
//        System.out.println(p2);
//        
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Ingrese nombre: ");
//        String nombre = sc.nextLine();
//        System.out.println("Ingrese apellido: ");
//        String apellido = sc.nextLine();
//        Persona p3 = new Persona(nombre, apellido, 0);
//        System.out.println(p3);
    }
    
}
