package modelo;

public class Biblioteca extends Libros
{
    public Biblioteca(String nombre, String editorial, String edicionLujo, int añoEdicion)
    {
        super(nombre, editorial, añoEdicion, edicionLujo);
    }


    public String mostrarNombre()
    {
        return this.nombre;
    }

    public String mostrarAutor()
    {
        return this.autor;
    }

    public String mostrarEditorial()
    {
        return this.editorial;
    }

    public int mostrarAñoEdicion()
    {
        return this.añoEdicion;
    }

    public String mostrarEdicionLujo()
    {
        if (edicionLujo.equals("Si"))
        {
            return "Edición de lujo";
        }
        else
        {
            return "Edición normal";
        }
        
    }


}
