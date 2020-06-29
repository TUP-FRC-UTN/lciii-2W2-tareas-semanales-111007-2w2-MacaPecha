/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import javax.swing.JFrame;

/**
 *
 * @author Maka
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal ventana = new Principal();
        
        ventana.setTitle("Inmobiliaria");
        ventana.setVisible(true);
        ventana.setSize(800, 500);
    }
}
