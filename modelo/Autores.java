package modelo;

public class Autores extends Libros
{
    public Autores(String autor, int numAutores)
    {
        super();
        this.autor=autor;
        this.numAutores=numAutores;
    }

    public String mostrarAutor()
    {
        if (numAutores > 1)
        {
            return this.autor + " y otros";
        }
        else
        {
            return this.autor;
        }
    }
}
