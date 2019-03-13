package naipes;

import java.util.Random;

public class Naipes implements INaipes
{

	private static final String[] PALOS = {"Oros", "Copas", "Espadas", "Bastos"};
	private static final String[] FIGURAS = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};

	private int[] naipes = new int[40];

	private int cont;


	public Naipes()
	{
		for (int i = 0; i < naipes.length; i++)
		{
			naipes[i] = i + 1;
		}
		cont = naipes.length;
	}


	@Override
	public String traducir(int numCarta)
	{
		if(numCarta < 1 || numCarta > 40)
		{
			return "";
		}

		numCarta--;

		return FIGURAS[numCarta % 10] + " de " + PALOS[numCarta / 10];
	}

	@Override
	public void barajar()
	{
		Random random = new Random();
		int aux;
		int j;
		for (int i = 0; i < cont; i++)
		{
			j = random.nextInt(cont);
			aux = naipes[i];
			naipes[i] = naipes[j];
			naipes[j] = aux;
		}
	}

	@Override
	public int extraerCartaAlAzar()
	{
		if(cont == 0)
		{
			return 0;
		}
		Random random = new Random();
		int iPosicion = random.nextInt(cont);
		int carta = naipes[iPosicion];
		for (int i = iPosicion; i < cont - 1; i++)
		{
			naipes[i] = naipes[i + 1];
		}
		cont--;
		return carta;
	}

	@Override
	public int extraerCartaArriba()
	{
		if(cont == 0)
		{
			return 0;
		}
		int carta = naipes[cont - 1];
		cont--;
		return carta;
	}

	@Override
	public int extraerCarta(int posicion)
	{
		posicion--;
		// Si no hay cartas o la posición no es válida
		if(cont == 0 || posicion >= cont)
		{
			return -1;
		}
		// Guardamos la carta a extraer
		int carta = naipes[posicion];
		// Compactamos el array de cartas
		for (int i = posicion; i < cont - 1; i++)
		{
			naipes[i] = naipes[i + 1];
		}
		// Restamos 1 carta al contador
		cont--;
		return carta;
	}

	@Override
	public boolean ponerCarta(int numCarta)
	{
		if(numCarta < 1 || numCarta > naipes.length)
		{
			return false;
		}
		if(cont == naipes.length)
		{
			return false;
		}
		// Si se encuentra la carta, nos salimos con false
		for (int i = 0; i < cont; i++)
		{
			if(numCarta == naipes[i])
			{
				return false;
			}
		}
		naipes[cont] = numCarta;
		cont++;
		return true;
	}

	@Override
	public int getNumCartas()
	{
		return cont;
	}

	@Override
	public void ordenar()
	{
		int aux;
		for (int i = 0; i < cont - 1; i++)
		{
			for (int j = i + 1; j < cont; j++)
			{
				if(naipes[j] < naipes[i])
				{
					aux = naipes[j];
					naipes[j] = naipes[i];
					naipes[i] = aux;
				}
			}
		}

	}

}
