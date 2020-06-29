/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franco;

/**
 *
 * @author Maka
 */

import java.util.Scanner;

public class Franco 
{
	public static void main (String[] args)
	{
		Batalla Battle = new Batalla();
		Battle.getGoku().Stats();
		Battle.Vegeta().Stats();
		Battle.Begins();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Presione una tecla para salir: ");
		String tecla = teclado.next();
	}
	
}
