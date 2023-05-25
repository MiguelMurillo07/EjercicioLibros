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
        if (numAutores <= 1)
        {
            return this.autor;
            
        }
        else
        {
            return this.autor + " y otros";
        }
    }

    public int mostrarNumAutores()
    {
        return this.numAutores;
    }

    


}
