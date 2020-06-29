/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.Scanner;
import java.util.Arrays;

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
        int tamanio = 2; //cantidad de libros a cargar
        Biblioteca biblio = new Biblioteca(tamanio);
        
        //carga de los datos del libro1
        Libro libro1 = new Libro("el quijote de la mancha", 300, 2, 3);
        Prestamo p1 = new Prestamo("tomy",5,true);
        Prestamo p2 = new Prestamo("pedro",7,true);
        Prestamo p3 = new Prestamo("juan",8,false);
        
        //agrego los 3 prestamos al libro1
        libro1.agregarPrestamo(p1);//recibe el objeto pago como parametro
        libro1.agregarPrestamo(p2);
        libro1.agregarPrestamo(p3);
        
        //agregar el libro1 a la biblioteca
        biblio.agregarLibro(libro1);//recibe el objeto plan como parametro
        
        //-----------------------------------------------------------------------------------
        //carga de los datos del libro2
        Libro libro2 = new Libro("la divina comedia", 400, 3, 5);
        Prestamo p21 = new Prestamo("pepe",5,true);
        Prestamo p22 = new Prestamo("ana",7,true);
        Prestamo p23 = new Prestamo("luis",8,true);
        Prestamo p24 = new Prestamo("maria",2,true);
        Prestamo p25 = new Prestamo("agus",1,false);
        
        //agrego los 5 prestamos al libro2
        libro2.agregarPrestamo(p21);//recibe el objeto pago como parametro
        libro2.agregarPrestamo(p22);
        libro2.agregarPrestamo(p23);
        libro2.agregarPrestamo(p24);
        libro2.agregarPrestamo(p25);
        
        //agregar el libro2 a la biblioteca
        biblio.agregarLibro(libro2);//recibe el objeto plan como parametro
        
        System.out.println("1-Cantidad de libros para los 3 estados(disponible - prestado - extraviado): " + Arrays.toString(biblio.cantidadLibrosPorEstado()));
        
        System.out.println("2-Sumatoria del precio de reposición de todos los libros extraviados: " + biblio.sumaPrecioExtraviados());
        
        System.out.println("3-Nombre de todos los solicitantes de un libro en particular identificado por su título");
        
        System.out.println("Título del libro: ");
        String titulo = sc.nextLine();
        System.out.println("3-El listado de todos los solicitantes del libro '"+ titulo +"' son: \n" + biblio.listadoSolicitantes(titulo));
        
        System.out.println("1-Cuántas veces es prestado en promedio cada libro: " + biblio.promedioPrestamos());

        
    }
    
}

