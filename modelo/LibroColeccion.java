package modelo;

public class LibroColeccion extends Libros
{
    private String coleccion;
    private String nombreColeccion;
    private int numeroColeccion;


    public LibroColeccion(String nombre, String editorial, int añoEdicion, String edicionLujo, String nombreColeccion, int numeroColeccion)
    {
        super(nombre, editorial, añoEdicion, edicionLujo);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    public String mostrarColeccion()
    {
        if (coleccion.equals("Si"))
        {
            
        }
        else
        {
            return "No es colección";
        }
    }

    public String mostrarNombreColeccion()
    {
        return this.nombreColeccion;
    }

    public int mostrarNumeroColeccion()
    {
        return this.numeroColeccion;
    }

}
