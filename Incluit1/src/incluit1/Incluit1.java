/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incluit1;

/**
 *
 * @author Maka
 */
public class Incluit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Termino a = new Termino (2);
        Termino b = new Termino (4);
        Termino c = new Termino (7);
        
        Suma s = new Suma (a, b);
        Multiplicacion r = new Multiplicacion(s, c);
        int resultado = r.valuar();
        System.out.println("La suma es: " + resultado);
    }
    
}
