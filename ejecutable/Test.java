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
        String nombre = JOptionPane.showInputDialog("Por favor escribe el nombre del libro: ");
        int numAutores = Integer.parseInt(JOptionPane.showInputDialog("Por favor digita el número de autores del libro: "));
        String autor = JOptionPane.showInputDialog("Por favor escribe el nombre del autor: ");
        String editorial = JOptionPane.showInputDialog("Por favor escribe el nombre de la editorial: ");
        int añoEdicion = Integer.parseInt(JOptionPane.showInputDialog("Por favor escribe el año de edición: "));
        String edicionLujo = JOptionPane.showInputDialog("Por favor escribe si es edición de lujo: ");
        String coleccion = JOptionPane.showInputDialog("El libro forma parte de una colección? (Si/No): ");
        

        if (coleccion.equals("Si"))
            {
                String nombreColeccion = JOptionPane.showInputDialog("Por favor escribe el nombre de la colección: ");
                int numeroColeccion = Integer.parseInt(JOptionPane.showInputDialog("Por favor escribe el número de la colección: "));
            }
        else
            {
                String nombreColeccion = "No es colección";
                int numeroColeccion = 00;
            }

        //Creacion objeto autores
        Autores autores = new Autores(autor, añoEdicion);

        //Creacion objeto libroColeccion
        LibroColeccion libroColeccion = new LibroColeccion(coleccion, coleccion, añoEdicion);

        //Creacion objeto biblioteca
        Biblioteca biblioteca = new Biblioteca(nombre, editorial, edicionLujo, añoEdicion);

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El nombre del libro es: " + biblioteca.mostrarNombre() + "\n" + "Número de autores del libro: "+numAutores+"\nEl nombre del autor es: " + autores.mostrarAutor() + "\n" + "La editorial es: " + biblioteca.mostrarEditorial() + "\n" + "El año de edición es: " + biblioteca.mostrarAñoEdicion() + "\n" + "La edición es: " + biblioteca.mostrarEdicionLujo()+"\nForma parte de Coleccion: "+libroColeccion.mostrarColeccion()+"\nNombre de Colección: "+libroColeccion.mostrarNombreColeccion()+"\nNúmero de Colección: "+libroColeccion.mostrarNumeroColeccion());
    }
    
}