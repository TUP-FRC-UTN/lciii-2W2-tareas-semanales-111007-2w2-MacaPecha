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
public class Libro {
    private String titulo;
    private int precio;
    private int estado;//1-disponible, 2-prestado, 3-extraviado
    private Prestamo [] prestamos;

    public Libro(String titulo, int precio, int estado, int cantPrestamos) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        //no incluir libros en el constructor
        prestamos = new Prestamo [cantPrestamos]; //dimensiono e inicializo el array de pagos
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getEstado() {
        return estado;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", estado=" + estado + ", prestamos=" + prestamos + '}';
    }
        //si no inicializo pagos en el contructor esto se rompe
    public void agregarPrestamo(Prestamo prestamo){
        // importante usar el length porque ya no tenemos mas a cantPrestamos
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = prestamo;
                break; // sin el break se llenan todos los indices del vector 
                //con el mismo parametro
            }
        }
    }
    
    public String listadoSolicitantes(){//de prestamos
        String lista = "";
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {
                lista += i+1 +"- " + prestamos[i].getSolicitante() + "\n";
            }
        }
        return lista;
    }
    
    public int cantidadPrestamos() {
        return prestamos.length;
    }
    
}
