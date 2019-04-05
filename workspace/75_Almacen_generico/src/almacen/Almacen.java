package almacen;

public class Almacen<T extends IComparador>
{
	private Object[] elementos;

	private int cont;

	public Almacen(int numMaximo)
	{
		elementos = new Object[numMaximo];
		cont = 0;
	}

	public int getCapacidad()
	{
		return elementos.length;
	}

	public int getNumeroElementos()
	{
		return cont;
	}

	/** Añade un elemento a la estructura
	* @param T
	* @return true si lo añade, false si ya existe o no cabe */
	public boolean anadir(T t)
	{
		if(cont == elementos.length)
		{
			return false;
		}
		int posInsercion = busquedaBinaria(t);
		if(posInsercion < 0)
		{
			return false;
		}
		for(int i = cont - 1; i >= posInsercion; i--)
		{
			elementos[i + 1] = elementos[i];
		}
		elementos[posInsercion] = t;
		cont++;
		return true;
	}

	/**
	 *
	 * @param t
	 * @return <0 si existe t, posición de inserción en caso contrario.
	 */
	private int busquedaBinaria(T t)
	{
		int inicio = 0;
		int fin = cont - 1;
		int centro;
		while(inicio <= fin)
		{
			centro = (inicio + fin ) / 2;
			if(t.sonIguales(elementos[centro]))
			{
				// Devolvemos el índice donde se encuentra el
				// elemento a eliminar, pero en negativo y desplazado
				// una unidad para evitar el 0 que no tiene signo.
				return (centro + 1) * (-1);
			}
			else if(t.esMayor(elementos[centro]))
			{
				inicio = centro + 1;
			}
			else
			{
				fin = centro - 1;
			}
		}
		return inicio;
	}

	/** Elimina un elemento a la estructura
	* @param T
	* @return true si lo elimina, false si no lo encuentra */
	public boolean eliminar(T t)
	{
		if(cont == 0)
			return false;
		int posEliminar = busquedaBinaria(t);
		if(posEliminar < 0) // Se ha encontrado
		{
			// Reajustamos el índice, que llega negativo y desplazado un
			// elemento.
			posEliminar = (posEliminar + 1) * -1;
			for(int i = posEliminar; i < cont - 1; i++)
			{
				elementos[i] = elementos[i + 1];
			}
			cont--;
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean existe(T t)
	{
		if(busquedaBinaria(t) < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Object[] getElementos()
	{
		Object[] aux = new Object[cont];
		for (int i = 0; i < aux.length; i++)
		{
			aux[i] = elementos[i];
		}
		return aux;
	}


}
