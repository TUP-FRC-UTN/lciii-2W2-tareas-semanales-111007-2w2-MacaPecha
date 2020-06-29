/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelaparcial;

/**
 *
 * @author Maka
 */
public class Examen {
    
    private int legajo;
    private String apellido;
    private int tipoEvaluacion; // 0-oral, 1-escrito, 2-ambos
    private int nota;

    public Examen(int legajo, String apellido, int tipoEvaluacion, int nota) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.tipoEvaluacion = tipoEvaluacion;
        this.nota = nota;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public int getNota() {
        return nota;
    }
    
    public String stringTipoEvaluacion() {
        String eval = "";
        if(getTipoEvaluacion() == 0){
            eval = "Oral";
        } else if(getTipoEvaluacion() == 1){
            eval = "Escrito";
        } else {
            eval = "Ambos";
        }
        return eval;
    }

    @Override
    public String toString() {
        return "legajo: " + legajo + ", apellido: " + apellido + ", tipoExamen: " + stringTipoEvaluacion() + ", nota: " + nota;
    }
    
}
