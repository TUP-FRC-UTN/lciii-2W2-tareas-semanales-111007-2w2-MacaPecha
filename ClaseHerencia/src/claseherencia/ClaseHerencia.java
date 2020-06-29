/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseherencia;

/**
 *
 * @author Maka
 */
public class ClaseHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ClientePreferencial c = new ClientePreferencial(1000, 1500, "colon 123",1 , "christian", "123");
//        System.out.println(c.toString());
        
        Cliente c1 = new ClientePreferencial(1000, 1500, "colon 123", 1, "christian", "123");
        System.out.println(c1.toString());
    }
    
}
