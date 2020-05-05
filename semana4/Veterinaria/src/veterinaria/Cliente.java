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

/**
 *
 * @author Maka
 */
public class Cliente {
    private int nro;
    private String nombre;
    private int antiguedad;
    private Mascota mascota;

    public Cliente(int nro, String nombre, int antiguedad, Mascota mascota) {
        this.nro = nro;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
    }

    public Cliente(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cliente() {
    }

    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nro=" + nro + ", nombre=" + nombre + ", antiguedad=" + antiguedad + ", mascota=" + mascota + '}';
    }
    
}
