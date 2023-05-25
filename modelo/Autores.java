package modelo;

public class Autores extends Libros
{
    private int numAutores;
    private String autor;
    public Autores(String autor, int numAutores)
    {
        super();
        this.autor=autor;
        this.numAutores=numAutores;
    }

    public String mostrarAutor()
    {
        if (numAutores > 2)
        {
            return this.autor + " y otros";
        }
        else
        {
            return this.autor;
        }
    }

    public int mostrarNumAutores()
    {
        return this.numAutores;
    }

    
}
