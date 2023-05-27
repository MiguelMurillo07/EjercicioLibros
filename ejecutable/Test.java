package ejecutable;

import javax.swing.JOptionPane;

import modelo.Autores;
import modelo.Libros;
import modelo.LibroColeccion;
import modelo.Biblioteca;


public class Test
{
    public static void main(String[] args)
    {
        boolean aggLibro = true;

        while (aggLibro) {
            String nombre = JOptionPane.showInputDialog("Por favor escribe el nombre del libro: ");
            int numAutores = Integer.parseInt(JOptionPane.showInputDialog("Por favor digita el número de autores del libro: "));
            String autor = JOptionPane.showInputDialog("Por favor escribe el nombre del autor: ");
            String editorial = JOptionPane.showInputDialog("Por favor escribe el nombre de la editorial: ");
            int añoEdicion = Integer.parseInt(JOptionPane.showInputDialog("Por favor escribe el año de edición: "));
            String edicionLujo = JOptionPane.showInputDialog("Por favor escribe si es edición de lujo: ");
            String coleccion = JOptionPane.showInputDialog("El libro forma parte de una colección? (Si/No): ");
            String nombreColeccion = "";
            int numeroColeccion = 0;

            if (coleccion.equalsIgnoreCase("Si")) {
                nombreColeccion = JOptionPane.showInputDialog("Por favor escribe el nombre de la colección: ");
                numeroColeccion = Integer.parseInt(JOptionPane.showInputDialog("Por favor escribe el número de la colección: "));
            } else {
                nombreColeccion = "No es colección";
                numeroColeccion = 0;
            }

            Autores autores = new Autores(autor, numAutores);
            LibroColeccion libroColeccion = new LibroColeccion(coleccion, nombreColeccion, numeroColeccion);
            Biblioteca biblioteca = new Biblioteca(nombre, editorial, edicionLujo, añoEdicion);

            JOptionPane.showMessageDialog(null, "El nombre del libro es: " + biblioteca.mostrarNombre() + "\n" + "Número de autores del libro: " + autores.mostrarNumAutores() + "\nNombre de autor del libro: " + autores.mostrarAutor() + "\nLa editorial es: " + biblioteca.mostrarEditorial() + "\n" + "El año de edición es: " + biblioteca.mostrarAñoEdicion() + "\n" + "La edición es: " + biblioteca.mostrarEdicionLujo() + "\nForma parte de Coleccion: " + libroColeccion.mostrarColeccion() + "\nNombre de Colección: " + libroColeccion.mostrarNombreColeccion() + "\nNúmero de Colección: " + libroColeccion.mostrarNumeroColeccion());

            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas agregar otro libro?", "Agregar Libro", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                aggLibro = false;
            }
        }


            /*if (numAutores > 1) {
                for (int i = 0; i < numAutores; i++) {
                    String nombreAutor = JOptionPane.showInputDialog("Ingrese el nombre del autor " + (i + 1) + ":");
                    JOptionPane.showMessageDialog(null, "Autor " + (i + 1) + ": " + nombreAutor);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El libro tiene un único autor, se llama: "+autor);
            }/* */

    }
    
}