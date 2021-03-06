package alumnos;

public class Alumno
{
	private String nombre;
	private double[] notas;

	public static final double SIN_NOTA = -1;

	public Alumno(String nombre)
	{
		this.nombre = nombre;
		notas = new double[3];
		for (int i = 0; i < notas.length; i++)
		{
			notas[i] = SIN_NOTA;
		}
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public boolean ponerNota(int evaluacion, double nota)
	{
		if(!Validar.evaluacionValida(evaluacion) || !Validar.notaValida(nota))
		{
			return false;
		}
		notas[evaluacion - 1] = nota;
		return true;
	}

	public int numeroNotas()
	{
		int contNotas = 0;
		for (int i = 0; i < notas.length; i++)
		{
			if(notas[i] != SIN_NOTA)
			{
				contNotas++;
			}
		}
		return contNotas;
	}

	public double notaMaxima()
	{
		double maxima = SIN_NOTA;
		for (int i = 0; i < notas.length; i++)
		{
			if(notas[i] > maxima)
			{
				maxima = notas[i];
			}
		}
		return maxima;
	}

	public boolean borrarNota(int evaluacion)
	{
		if(!Validar.evaluacionValida(evaluacion))
		{
			return false;
		}
		notas[evaluacion - 1] = SIN_NOTA;
		return true;
	}

	public boolean tieneNota(int evaluacion)
	{
		if(!Validar.evaluacionValida(evaluacion))
		{
			return false;
		}
		return notas[evaluacion - 1] != SIN_NOTA;
	}

	public double getNota(int evaluacion)
	{
		if(!Validar.evaluacionValida(evaluacion))
		{
			return -1;
		}
		return notas[evaluacion - 1];
	}

}
