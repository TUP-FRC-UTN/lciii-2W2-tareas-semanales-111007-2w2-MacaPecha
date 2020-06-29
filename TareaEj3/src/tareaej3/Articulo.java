package tareaej3;
/**
 *
 * @author Maka
 */
public class Articulo {
    private double precio;
    private int cantidad;

    public Articulo(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Articulo: " + "precio=" + precio + ", cantidad=" + cantidad;
    }
    
}
