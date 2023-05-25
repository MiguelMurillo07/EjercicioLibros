package modelo;

public class LibroColeccion extends Libros
{
    protected String nombreColeccion;
    protected int numeroColeccion;


    public LibroColeccion(String nombre, String editorial, int añoEdicion, String edicionLujo, String nombreColeccion, int numeroColeccion)
    {
        super(nombre, editorial, añoEdicion, edicionLujo);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }
}
