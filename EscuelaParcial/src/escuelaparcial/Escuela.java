package escuelaparcial;

import java.util.ArrayList;

/**
 *
 * @author Maka
 */
public class Escuela {
    private ArrayList<Examen> examenes; // arreglo dinamico con objetos de tipo Examen

    public Escuela() {
        examenes = new ArrayList(); // inicializado, se crea el objeto, en este caso no se define tamaño
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void agregarExamen(Examen e){
        examenes.add(e); // eso es todo para agregar al arrayList, al final de la coleccion
    }
    
    public double promedioNotas(){
        double acumulador = 0;
        int contador = 0;
        for (Examen e : examenes ) {
            acumulador += e.getNota();
            contador++;
        }
        if(contador==0) return 0;
        else return acumulador/contador;
    }
    
    public int cantidadAlumnosMas7Orales() {
        int contador = 0;
        for (Examen e : examenes ) {
            if (e.getTipoEvaluacion() == 0 && e.getNota() > 7) {
                contador ++;
            }
        }
        return contador;
    }
}
