/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Maka
 */
public class Biblioteca {
    private Libro [] libros;
    
    public Biblioteca(int tamanio){
        libros = new Libro[tamanio];//dimensiono e inicializo el array de planes
    }
    
    //si no inicializo libro en el contructor esto se rompe
    public void agregarLibro(Libro libro){
        // importante usar el length porque ya no tenemos mas a tamanio
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = libro;
                break; // sin el break se llenan todos los indices del vector 
                //con el mismo parametro
            }
        }
    }
    
    public int cantidadLibros(int estado){
        int cantLibros = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getEstado() == estado) {
                cantLibros ++;
            }
        }
        return cantLibros;
    }
    
    public int[] cantidadLibrosPorEstado(){
        int librosPorEstado[] = new int[3];
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                switch(libros[i].getEstado()){
                    case 1: //1-disponible
                        librosPorEstado[0]++;
                        break;
                    case 2: //2-prestado
                        librosPorEstado[1]++;
                        break;
                    case 3: //3-extraviado
                        librosPorEstado[2]++;
                        break;
                }
            }
        }
        return librosPorEstado;
    }
    
    public String listadoSolicitantes(String nombre){
        String lista = "";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && (libros[i].getTitulo().equals(nombre))) {
                lista = libros[i].listadoSolicitantes();
                break;//importante!!! 
            } else {
                lista= "El titulo "+nombre+" no tiene un prestamo registrado!";
            }
        }
        return lista;
    }
    
    public double promedioPrestamos(){
        double totalPrestamos = 0; 
        int contLibros = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                //acumulador 
                totalPrestamos += libros[i].cantidadPrestamos();
                contLibros++;
            }
        }
        // total acumulado / cantidad de elementos
        if (contLibros == 0) {
            return 0;
        } else {
            return totalPrestamos / contLibros; //si no hubo ningun pago con demora da cero
        }
    }
    
    public double sumaPrecioExtraviados(){
        double totalExtraviados = 0; 
        for (int i = 0; i < libros.length; i++) {
           if (libros[i] != null && libros[i].getEstado() == 2) {
               //acumulador 
               totalExtraviados += libros[i].getPrecio();
           }
        }
        return totalExtraviados;
    }
    
    
}