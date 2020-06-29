/*
3.	Una empresa que fabrica caños de diferentes tipos, materiales y medidas 
está desarrollando un sistema para automatizar la planificación y control de su 
circuito productivo. Suponga que usted es parte del equipo de desarrollo y le 
asignan la siguiente tarea: 
 
•	Desarrolle la clase Material de manera que contenga en su interior los 
atributos: descripción (String) código(int) valorUnitario (float). 
•	Desarrolle la clase Producto de manera que contenga en su interior los 
atributos descripción (String) y Materiales (Material[]). 
•	Desarrolle en la clase Producto un constructor que reciba por parámetro 
una cantidad de elementos y dimensione el vector de materiales. 
•	Desarrolle en la clase Producto un método que permita agregar un 
Material recibido por parámetro al vector. 
•	Desarrolle en la clase Producto un método que retorne el costo total. 
Dicho valor se calcula sumando todos los valores unitarios de los Materiales que 
componen el Producto. 
•	Desarrolle en la clase Producto un método que reciba por parámetro un 
código de material y retorne true si dicho material forma parte del Producto. 
•	Desarrolle en la clase producto un método que retorne un vector con 
todos los materiales que tengan un valor unitario menor a un parámetro. 
•	Desarrolle en la clase producto un método que retorne un vector donde 
cada casillero contenga la cantidad de materiales por precio, siguiendo las 
siguiente regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 
10 < precio ≤ 20 contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo 
en el tercer casillero. Si precio > 30 contarlo en el cuarto casillero. 
•	Desarrolle un programa principal que permita ingresar los datos de un 
producto, cree un objeto de esa clase y luego posibilite mediante un menú llamar 
a los métodos de los puntos 4 a 8 todas las veces y en el orden que el usuario quiera. 

 */
package fabrica;

/**
 *
 * @author Maka
 */
public class Fabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p = new Producto("puerta", 4);
        
        Material m1 = new Material("picaporte", 1, 29);
        Material m2 = new Material("mirilla", 2, 10);
        Material m3 = new Material("placa de madera", 3, 200);
        Material m4 = new Material("pintura", 4, 80);
        
        p.agregarMaterial(m1);
        p.agregarMaterial(m2);
        p.agregarMaterial(m3);
        p.agregarMaterial(m4);
        
        Material [] materiales = p.materialesMenoresParam(50);//llamo el arreglo y lo deposito en la variable
        
        System.out.println("Los materiales con valor unitario menor a 50 son: ");
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                System.out.println(materiales[i].toString());
            } 
        };
        
        int [] contadores = p.cantidadXPrecio();
        System.out.println("Los materiales con valor unitario entre 0 y 10 son : " + contadores[0]);
        System.out.println("Los materiales con valor unitario entre 10 y 20 son : " + contadores[1]);
        System.out.println("Los materiales con valor unitario entre 20 y 30 son : " + contadores[2]);
        System.out.println("Los materiales con valor unitario mayor a 30 son : " + contadores[3]);
        
    }
    
}
