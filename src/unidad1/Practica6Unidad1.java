package unidad1;

import javax.swing.JOptionPane;

public class Practica6Unidad1 {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Base: ","Ingrese el valor de la base",JOptionPane.QUESTION_MESSAGE));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Altura: ","Ingrese el valor de la altura",JOptionPane.QUESTION_MESSAGE));
        
        double area = (base * altura) / 2;
        
        System.out.println("El área del triángulo es: " + area + " metros cuadrados.");
    }
}

