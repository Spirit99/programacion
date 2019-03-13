package naipes;

public class Main
{

	public static void main(String[] args)
	{
		Naipes naipes = new Naipes();

		System.out.println("Traducciones:");
		for (int i = 1; i <= 40; i++)
		{
			System.out.println(naipes.traducir(i));
		}
		System.out.println("Extraer arriba:");
		System.out.println(naipes.traducir(naipes.extraerCartaArriba()));
		System.out.println(naipes.traducir(naipes.extraerCartaArriba()));
		System.out.println("Número de cartas: " + naipes.getNumCartas());

		System.out.println("Extracción por posición:");
		System.out.println(naipes.traducir(naipes.extraerCarta(1)));
		System.out.println(naipes.traducir(naipes.extraerCarta(37)));

		System.out.println(naipes.ponerCarta(10));
		System.out.println(naipes.ponerCarta(1));

		System.out.println("Extraer cartas:");

		int num = naipes.getNumCartas();

		for (int i = 0; i < num; i++)
		{
			System.out.println(naipes.traducir(naipes.extraerCartaAlAzar()));
		}

		// Metemos los oros
		for (int i = 1; i <= 10 ; i++)
		{
			naipes.ponerCarta(i);
		}

		naipes.barajar();

		System.out.println("Mostrar los oros tras barajar:");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(naipes.traducir(naipes.extraerCartaArriba()));
		}

		// Metemos los oros
		for (int i = 1; i <= 10 ; i++)
		{
			naipes.ponerCarta(i);
		}
		naipes.barajar();

		naipes.ordenar();

		System.out.println("Mostrar los oros tras ordenar:");
		for (int i = 0; i < 10; i++)
		{
			System.out.println(naipes.traducir(naipes.extraerCartaArriba()));
		}
	}
}
