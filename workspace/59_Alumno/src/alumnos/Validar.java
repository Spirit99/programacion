package alumnos;

public class Validar
{
	public static boolean evaluacionValida(int evaluacion)
	{
		if(evaluacion < 1 || evaluacion > 3)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static boolean notaValida(double nota)
	{
		if(nota < 0 || nota > 10)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
