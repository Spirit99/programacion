package nombres;

public class Nombres
{
	private String[] nombres;
	private int cont = 0;

	public Nombres(int tamaño)
	{
		nombres = new String[tamaño];
	}

	public boolean anadir(String nombre)
	{
		if(nombres.length == cont)
		{
			return false;
		}

		for (int i = 0; i < cont; i++)
		{
			if(nombre.equalsIgnoreCase(nombres[i]))
			{
				return false;
			}
		}

		nombres[cont] = nombre;
		cont++;
		return true;
	}

	public boolean eliminar(String nombre)
	{
		boolean encontrado = false;
		int iEliminar = -1;
		for (int i = 0; i < cont && !encontrado; i++)
		{
			if(nombre.equalsIgnoreCase(nombres[i]))
			{
				encontrado = true;
				iEliminar = i;
			}
		}
		if(encontrado)
		{
			for (int i = iEliminar; i < cont - 1; i++)
			{
				nombres[i] = nombres[i + 1];
			}
			cont--;
		}
		return encontrado;
	}

	public void vaciar()
	{
		cont = 0;
	}



	/**
	 * Método para recuperar los elmentos de
	 * la estructura. La posición empezará por
	 * el índice 0.
	 * @param posicion Índice de la posición, empezando desde 0.
	 * @return El elemento String que hay en esa posición. Devuelve null
	 * si es una posición no válida.
	 */
	public String getNombre(int posicion)
	{
		// Validamos la posición
		if(posicion >= 0 && posicion < cont)
		{
			return nombres[posicion];
		}
		else
		{
			return null;
		}
	}

	/**
	 * Conocer el número de elementos que hay
	 * en la estructura.
	 * @return Número de elementos.
	 */
	public int getNumeroNombres()
	{
		return cont;
	}

	public int getCapacidad()
	{
		return nombres.length;
	}

	public boolean estaLlena()
	{
		return nombres.length == cont;
	}

	public boolean buscarNombre(String nombre)
	{
		for (int i = 0; i < cont; i++)
		{
			if(nombre.equalsIgnoreCase(nombres[i]))
			{
				return true;
			}
		}
		return false;
	}


}
