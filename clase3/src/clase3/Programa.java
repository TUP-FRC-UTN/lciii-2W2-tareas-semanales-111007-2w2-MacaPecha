package clase3;

/**
 *
 * @author Maka
 */
public class Programa {
    
    public static void main(String[] args) {
    
        Persona p = new Persona();
        p.setNombre("Maca");
        p.setApellido("Pecha");
        p.setAnoNac(1994);
        
        Persona q = new Persona("Michi", "Mi Gato", 1998);
        
        System.out.println(p.nombreCompleto());
        System.out.println(q.nombreCompleto());
        
        System.out.println(p);//muestra el toString
        System.out.println(q);
    }
}
