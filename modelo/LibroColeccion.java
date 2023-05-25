package modelo;

public class LibroColeccion extends Libros
{
    private String coleccion;
    private String nombreColeccion;
    private int numeroColeccion;


    public LibroColeccion(String coleccion, String nombreColeccion, int numeroColeccion)
    {
        super();
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
        this.coleccion = coleccion;
    }

    public String mostrarColeccion()
    {
        return this.coleccion;
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
