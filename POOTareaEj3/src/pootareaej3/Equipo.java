package pootareaej3;
/**
 *
 * @author Maka
 */
public class Equipo {
    private String nombre;
    private int puntos;
    private int partGanados;
    private int partEmpatados;
    private int partPerdidos;
    private int golesRealizados;
    private int golesRecibidos;
    private int posicion;

    public Equipo(int puntos, int partGanados, int partEmpatados, int partPerdidos, int golesRealizados, int golesRecibidos, int posicion) {
        this.puntos = puntos;
        this.partGanados = partGanados;
        this.partEmpatados = partEmpatados;
        this.partPerdidos = partPerdidos;
        this.golesRealizados = golesRealizados;
        this.golesRecibidos = golesRecibidos;
        this.posicion = posicion;
    }
    
    public Equipo(String nombre, int puntos, int partGanados, int partEmpatados, int partPerdidos, int golesRealizados, int golesRecibidos, int posicion) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.partGanados = partGanados;
        this.partEmpatados = partEmpatados;
        this.partPerdidos = partPerdidos;
        this.golesRealizados = golesRealizados;
        this.golesRecibidos = golesRecibidos;
        this.posicion = posicion;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartGanados() {
        return partGanados;
    }

    public int getPartEmpatados() {
        return partEmpatados;
    }

    public int getPartPerdidos() {
        return partPerdidos;
    }

    public int getGolesRealizados() {
        return golesRealizados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPartGanados(int partGanados) {
        this.partGanados = partGanados;
    }

    public void setPartEmpatados(int partEmpatados) {
        this.partEmpatados = partEmpatados;
    }

    public void setPartPerdidos(int partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public void setGolesRealizados(int golesRealizados) {
        this.golesRealizados = golesRealizados;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Equipo: " + "nombre=" + nombre + ", puntos=" + puntos + ", partGanados=" + partGanados + ", partEmpatados=" + partEmpatados + ", partPerdidos=" + partPerdidos + ", golesRealizados=" + golesRealizados + ", golesRecibidos=" + golesRecibidos + ", posicion=" + posicion;
    }
    
}
