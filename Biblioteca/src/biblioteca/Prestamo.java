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
public class Prestamo {
    String solicitante;
    int cantDias;
    boolean devuelto;

    public Prestamo(String solicitante, int cantDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantDias = cantDias;
        this.devuelto = devuelto;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public int getCantDias() {
        return cantDias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "solicitante=" + solicitante + ", cantDias=" + cantDias + ", devuelto=" + devuelto + '}';
    }
    
    
}
