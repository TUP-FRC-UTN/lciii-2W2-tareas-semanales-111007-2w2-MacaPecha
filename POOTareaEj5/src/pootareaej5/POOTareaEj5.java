/*
5.Dado el valor de los tres lados de un triángulo se necesita calcular su 
perímetro. Se pide crear en el método main() un objeto y determinar si el 
perímetro es superior a 10. Determinar la o las clases necesarias, sus atributos 
y métodos
 */
package pootareaej5;
import java.util.Scanner;
/**
 * @author Maka
 */
public class POOTareaEj5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo ();
        System.out.println("Ingrese el lado 1");
        double lado1 = sc.nextDouble();
        t.setLado1(lado1);
        System.out.println("Ingrese el lado 2");
        double lado2 = sc.nextDouble();
        t.setLado2(lado2);
        System.out.println("Ingrese el lado 3");
        double lado3 = sc.nextDouble();
        t.setLado3(lado3);
        System.out.println("El perimetro es : "+t.perimetro());
    }
    
}
