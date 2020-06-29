package pootareaej3;
import java.util.Scanner;
/**
 *
 * @author Maka
 */
public class POOTareaEj3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programar una clase Equipo que represente a un equipo de fútbol. 
        //Incluir en la misma atributos para almacenar el nombre del equipo y 
        //los datos relativos a un campeonato con forma de liga: puntos, 
        //cantidad de partidos ganados, empatados y perdidos, cantidad de goles
        //realizados y recibidos y posición
        Scanner sc = new Scanner(System.in);
        int salir;
        do {
            Equipo e = new Equipo();
            System.out.println("Ingrese el nombre del equipo");
            String nombre = sc.next();
            e.setNombre(nombre);
            System.out.println("Ingrese los puntos");
            int puntos = sc.nextInt();
            e.setPuntos(puntos);
            System.out.println("Ingrese cantidad de partidos ganados");
            int partGanados = sc.nextInt();
            e.setPartGanados(partGanados);
            System.out.println("Ingrese cantidad de partidos empatados");
            int partEmpatados = sc.nextInt();
            e.setPartEmpatados(partEmpatados);
            System.out.println("Ingrese cantidad de partidos perdidos");
            int partPerdidos = sc.nextInt();
            e.setPartPerdidos(partPerdidos);
            System.out.println("Ingrese cantidad de goles realizados");
            int golesRealizados = sc.nextInt();
            e.setGolesRealizados(golesRealizados);
            System.out.println("Ingrese cantidad de goles recibidos");
            int golesRecibidos = sc.nextInt();
            e.setGolesRecibidos(golesRecibidos);
            
            System.out.println(e);
            
            System.out.println("Ingrese 0 para salir");
            salir = sc.nextInt();
        } while (salir != 0);
        

    }
}
