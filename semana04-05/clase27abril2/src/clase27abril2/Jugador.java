/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27abril2;

/**
 *
 * @author Maka
 */
public class Jugador {
    private String nombre;
    private int posicion;
    private int nroCamiseta;
    private int cantPartidosJugados;
    private int estadoFisico;

    public Jugador(String nombre, int posicion, int nroCamiseta, int cantPartidosJugados, int estadoFisico) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.cantPartidosJugados = cantPartidosJugados;
        this.estadoFisico = estadoFisico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidosJugados = cantPartidosJugados;
    }

    public void setEstadoFisico(int estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public int getCantPartidosJugados() {
        return cantPartidosJugados;
    }

    public int getEstadoFisico() {
        return estadoFisico;
    }

    
    
}
