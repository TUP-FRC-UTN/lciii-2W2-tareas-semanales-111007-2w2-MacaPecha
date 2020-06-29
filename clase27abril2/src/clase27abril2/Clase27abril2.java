/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27abril2;
import java.util.Scanner;

/**
 *
 * @author Maka
 */
public class Clase27abril2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Jugador [] jugadores;
        
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cantJugadores = sc.nextInt();
        
        jugadores = new Jugador[cantJugadores];
        
        for (int i = 0; i < jugadores.length; i++) {
            sc.nextLine(); //para que capture el enter
            
            System.out.println("Ingrese el nombre del jugador: " + (i+1));
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese la posicion del jugador: ");
            int posicion = sc.nextInt();
            
            System.out.println("Ingrese el numero de camiseta del jugador: ");
            int nroCamiseta = sc.nextInt();
            
            System.out.println("Ingrese la cantidad de partidos jugados del jugador: ");
            int cantPartidosJugados = sc.nextInt();
            
            System.out.println("Ingrese el estado fisico del jugador: ");
            int estadoFisico = sc.nextInt();
            
            jugadores[i]= new Jugador(nombre, posicion, nroCamiseta, cantPartidosJugados, estadoFisico);
        }
        
        //null pointer exception: ocurre si llamo al metodo a una referencia que
        //no tiene un objeto asignado
        
        int cantJugadoresMenos10 = 0;
        Jugador auxiliar = jugadores[0];
        
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i]!=null && jugadores[i].getCantPartidosJugados() < 10) {
                cantJugadoresMenos10++;
            }
        }
        System.out.println("Hay "+ cantJugadoresMenos10 +" jugadores con menos de 10 partidos jugados");
        
        for (int j = 0; j < jugadores.length; j++) {
            if(jugadores[j]!=null && jugadores[j].getCantPartidosJugados() > auxiliar.getCantPartidosJugados()) {
                auxiliar = jugadores[j];
            }    
        }
        System.out.println("El jugador con mas partidos ganados es "+ auxiliar.getNombre());
        
        int acumuladorEstadoFisico = 0;
        int contadorJugadores = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] != null) {
                acumuladorEstadoFisico += jugadores[i].getEstadoFisico();
                contadorJugadores++;
            }    
        }
        System.out.println("El promedio del estado fisico es "+ acumuladorEstadoFisico/contadorJugadores);
        
        System.out.println("Ingrese un numero de camiseta: ");
        int nroCamiseta = sc.nextInt();
        int estadoFisicoEncontrado = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] != null && jugadores[i].getNroCamiseta() == nroCamiseta) {
                estadoFisicoEncontrado = jugadores[i].getEstadoFisico();
                break;
            }    
        }
        System.out.println("El estado fisico del jugador con el numero de camiseta "+ nroCamiseta +" es "+ estadoFisicoEncontrado);
        
        int [] acumuladorPosicion = new int [4];
        int [] contadorPosicion = new int [4];
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i] != null) {
                switch (jugadores[i].getPosicion()) {
                    case 1:
                        acumuladorPosicion[0] += jugadores[i].getCantPartidosJugados();
                        contadorPosicion[0]++;
                        break;
                    case 2:
                        acumuladorPosicion[1] += jugadores[i].getCantPartidosJugados();
                        contadorPosicion[1]++;
                        break;
                    case 3:
                        acumuladorPosicion[2] += jugadores[i].getCantPartidosJugados();
                        contadorPosicion[2]++;
                        break;
                    case 4:
                        acumuladorPosicion[3] += jugadores[i].getCantPartidosJugados();
                        contadorPosicion[3]++;
                        break;
                }
            }    
        }
        if (contadorPosicion[0] != 0) {
            System.out.println("El promedio de partidos jugados de la posicion 1 es: "+ (double) acumuladorPosicion[0]/contadorPosicion[0]);
        } if(contadorPosicion[1] != 0) {
            System.out.println("El promedio de partidos jugados de la posicion 2 es: "+ (double) acumuladorPosicion[1]/contadorPosicion[1]);
        } if(contadorPosicion[2] != 0) {
            System.out.println("El promedio de partidos jugados de la posicion 3 es: "+ (double) acumuladorPosicion[2]/contadorPosicion[2]);
        } if(contadorPosicion[3] != 0) {
            System.out.println("El promedio de partidos jugados de la posicion 4 es: "+ (double) acumuladorPosicion[3]/contadorPosicion[3]);
        }
        
  
      
        
        
    }
    
}
