package modelo;

public class Libros 
{
    protected String nombre;
    protected String autor;
    protected String editorial;
    protected int añoEdicion;
    protected String edicionLujo;

    public Libros(String nombre, String autor, String editorial, int añoEdicion, String edicionLujo)
    {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.añoEdicion = añoEdicion;
        this.edicionLujo = edicionLujo;
    }

    
}
