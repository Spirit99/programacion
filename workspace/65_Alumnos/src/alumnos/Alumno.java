package alumnos;

public class Alumno implements IAlumno
{

	private final static int NUM_NOTAS = 10;
	private int[] notas;
	private int cont;
	private String nombre;


	public Alumno(String nombre)
	{
		this.nombre = nombre;
		notas = new int[NUM_NOTAS];
		cont = 0;
	}

	@Override
	public String getNombre()
	{
		return nombre;
	}

	@Override
	public boolean anadeNota(int nota)
	{
		if(nota < 0 || nota > 10)
		{
			return false;
		}

		if(cont == NUM_NOTAS)
		{
			return false;
		}

		notas[cont] = nota;
		cont++;
		return true;
	}

	@Override
	public int[] getNotas()
	{

		int[] auxNotas = new int[cont];

		for (int i = 0; i < cont; i++)
		{
			auxNotas[i] = notas[i];
		}

		return auxNotas;
	}

	@Override
	public int numNotas()
	{
		return cont;
	}

	@Override
	public float getNotaMedia()
	{
		if(cont == 0)
		{
			return -1;
		}
		int sumaNotas = 0;
		for (int i = 0; i < cont; i++)
		{
			sumaNotas += notas[i];
		}
		return (float)sumaNotas / cont;
	}

	@Override
	public int getNumeroAprobados()
	{
		int contAprobados = 0;
		for (int i = 0; i < cont; i++)
		{
			if(notas[i] >= 5)
			{
				contAprobados++;
			}
		}
		return contAprobados;
	}

	@Override
	public void borrarNotas()
	{
		cont = 0;
	}
}
