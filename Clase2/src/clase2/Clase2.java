package clase2;
import java.util.Scanner;
/**
 * @author Maka
 */
public class Clase2 {

    public static void main(String[] args) {
        // TODO code application logic here
//        int numero1;
//        numero1 = 1;
//
//        System.out.println("Ingrese un numero: ");
//
//        Scanner lector = new Scanner(System.in);
//        int numero = lector.nextInt();
//        //String palabraSola = lector.next();
//        //String frase = lector.nextLine();
//        System.out.println("Tu numero es: "+ numero);
//
//        lector.nextLine();
//
//        System.out.println("Ingrese un nombre: ");
//        String nombre = lector.nextLine();
//        //el nextLine se come un enter
//        System.out.println("El nombre es: "+ nombre);
//
        int a1, a2;
        a1 = 5;
        a2 = 2;
//        int suma = a1 + a2;
//        int resta = a1 - a2;
//        int multiplicacion = a1 * a2;
//        float division = (float) a1 / a2;
//        
//        System.out.println("suma: "+suma);
//        System.out.println("resta: "+resta);
//        System.out.println("multiplicacion: "+multiplicacion);
//        System.out.println("division: "+division);
//       
//        if (a1 > a2 || a1 < 8) {
//            
//        } else if(a2 > a1) {
//        
//        } else {
//        
//        }
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//--------------------------------------------------------------
//        int i=0;
//        while (i<10) {
//            i++;
//            System.out.println(i);
//        }
//---------------------------------------------------------------
//        int variableDoWhile = 6;
//        do {
//            if (a1 != a2) {
//                variableDoWhile = 1;
//            }
//            System.out.println("entra");
//        } while (variableDoWhile == 6);
//        System.out.println("sale");
//---------------------------------------------------------------
//ingresar una cantidad de numeros solicitada por el usuario y 
//calcular el promedio
int cantidad;
int numero;
int suma = 0;
float promedio;
Scanner lector = new Scanner(System.in);
        System.out.println("ingrese cuantos numeros quiere promediar:");
        cantidad = lector.nextInt();
        for (int i = 0; i < cantidad; i++) {
            lector.nextLine();
            System.out.println("numero "+ (i+1));
            numero = lector.nextInt();
            suma += numero;
        }
        promedio = (float)suma / cantidad;
        System.out.println("El promedio es: "+promedio);

    }
    
}
