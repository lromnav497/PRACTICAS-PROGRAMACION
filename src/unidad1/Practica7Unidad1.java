package unidad1;

import javax.swing.JOptionPane;

public class Practica7Unidad1 {
    public static void main(String[] args) {
        double sueldobruto = Double.parseDouble(JOptionPane.showInputDialog(null,"Sueldo  bruto: ","Ingrese su sueldo bruto",JOptionPane.QUESTION_MESSAGE));
        double porcentajeimpuestos = Double.parseDouble(JOptionPane.showInputDialog(null,"Impuestos: ","Ingrese el porcentaje de impuestos",JOptionPane.QUESTION_MESSAGE));
        double impuestos = sueldobruto * (porcentajeimpuestos / 100);
        double sueldoneto = sueldobruto - impuestos;    
        
        System.out.println("Tu sueldo neto es: " + sueldoneto);
    }
}
