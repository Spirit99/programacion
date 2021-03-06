package alumnos;

public class Alumnos
{

	private Alumno[] alumnos;
	private int cont = 0;

	public Alumnos(int capacidad)
	{
		alumnos = new Alumno[capacidad];
	}

	public boolean añadirAlumno(Alumno alumno)
	{
		if(alumnos.length == cont)
		{
			return false;
		}
		for (int i = 0; i < cont; i++)
		{
			if(alumno.getNombre().equalsIgnoreCase(alumnos[i].getNombre()))
			{
				return false;
			}
		}
		alumnos[cont] = alumno;
		cont++;
		return true;
	}

	public boolean eliminarAlumno(Alumno alumno)
	{
		int iEliminar = posicionAlumno(alumno);
		if(iEliminar == -1)
		{
			return false;
		}
		for (int i = iEliminar; i < cont -1; i++)
		{
			alumnos[i] = alumnos[i + 1];
		}
		cont--;
		return true;
	}

	public boolean existe(Alumno alumno)
	{
		if(posicionAlumno(alumno) == -1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public boolean ponerNota(Alumno alumno, int evaluacion, double nota)
	{
		int iAlumno = posicionAlumno(alumno);
		if(iAlumno == -1)
		{
			return false;
		}
		if(!Validar.evaluacionValida(evaluacion) || !Validar.notaValida(nota))
		{
			return false;
		}

		alumnos[iAlumno].ponerNota(evaluacion, nota);
		return true;
	}


	public boolean borrarNota(Alumno alumno, int evaluacion)
	{
		int iAlumno = posicionAlumno(alumno);
		if(iAlumno == -1)
		{
			return false;
		}
		if(!Validar.evaluacionValida(evaluacion))
		{
			return false;
		}
		alumnos[iAlumno].borrarNota(evaluacion);
		return true;
	}

	public Alumno[] getAlumnos()
	{
		Alumno[] alums = new Alumno[cont];
		for (int i = 0; i < cont; i++)
		{
			alums[i] = alumnos[i];
		}
		return alums;
	}

	public boolean estaLleno()
	{
		return alumnos.length == cont;
	}

	/**
	 * Busca un alumno en el array por nombre.
	 * @param alumno
	 * @return -1 si no se encuentra el alumno, o
	 * la posición si lo encuentra.
	 */
	private int posicionAlumno(Alumno alumno)
	{
		for (int i = 0; i < cont; i++)
		{
			if(alumno.getNombre().equalsIgnoreCase(alumnos[i].getNombre()))
			{
				return i;
			}
		}
		return -1;
	}

}
