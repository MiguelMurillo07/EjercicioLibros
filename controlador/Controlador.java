package controlador;

import javax.swing.JOptionPane;

public class Controlador 
{
    public static void main(String[] args) {
        //Entrada de datos
        String nombre = JOptionPane.showInputDialog("Por favor escribe el nombre del libro: ");
        String autor = JOptionPane.showInputDialog("Por favor escribe el nombre del autor: ");
        String editorial = JOptionPane.showInputDialog("Por favor escribe el nombre de la editorial: ");
        int añoEdicion = Integer.parseInt(JOptionPane.showInputDialog("Por favor escribe el año de edición: "));
        String edicionLujo = JOptionPane.showInputDialog("Por favor escribe si es edición de lujo: ");
        
    }
}
