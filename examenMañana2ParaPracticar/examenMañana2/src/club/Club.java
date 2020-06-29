/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Club {
    
    private ArrayList<Socio> Socios;

    public Club() {
        Socios = new ArrayList();
    }
    
    public void agregarSocio(Socio s){
        Socios.add(s);
    }

    public ArrayList<Socio> getSocios() {
        return Socios;
    }
    
    public String totalCuotas(){
        int acumulador=0;
        for (Socio s:Socios){
            acumulador += s.getCuota();
            if (s.getAdicionales() > 0){
                for (int i = 0; i < s.getAdicionales(); i++) {
                    acumulador += 500; // Suma los adicionales
                }
            }
        }
        return "Cantidad de cuotas :"+acumulador;
    }
    
    public String report2(){
        int contador=0;
        for (Socio s:Socios){
            if (s.getAdicionales() > 2 && s.getCuota() == 2300){
                contador++;
            }
        }
        return "Cantidad de socios full con mas de 2 adicionales: "+contador;
    }

    
}
