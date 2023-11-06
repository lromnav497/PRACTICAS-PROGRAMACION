package unidad1;

import java.util.Scanner;

public class Practica8Unidad1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a:");
        double a = teclado.nextDouble();
        
        System.out.println("Ingrese el valor de b:");
        double b = teclado.nextDouble();
        
        System.out.println("Ingrese el valor de c:");
        double c = teclado.nextDouble();
        
        double xpositiva = b+Math.sqrt(Math.pow(b, 2)-4*a*c);
        double xnegativa = -b+Math.sqrt(Math.pow(b, 2)-4*a*c);
        
        System.out.println("La solución es: x = " + xpositiva);
        System.out.println("La solución es: x = " + xnegativa);
    }
}
