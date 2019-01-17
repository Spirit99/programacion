package poo;

public class Pelicula
{
	// Atributos
	private String titulo;
	private String director;
	private int añoEstreno;
	private int numEspectadores;


	// Constructor
	public Pelicula(String titulo, String director, int añoEstreno)
	{
		this.titulo = titulo;
		this.director = director;
		this.añoEstreno = añoEstreno;

		numEspectadores = 0;
	}

	// Métodos
	// Getters y Setters

	//Getters
	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}

	public int getAñoEstreno()
	{
		return añoEstreno;
	}

	public void sumaEspectadores(int nuevosEspectadores)
	{
		numEspectadores += nuevosEspectadores;
	}


	public int getTotalEspectadores()
	{
		return numEspectadores;
	}
}
