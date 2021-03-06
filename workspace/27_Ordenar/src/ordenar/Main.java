package ordenar;

import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		final int NUM = 23;
		int[] numeros = new int[NUM];
		Random random = new Random();
		System.out.println("Rellenando aleatorios...");
		for (int i = 0; i < numeros.length; i++)
		{
			numeros[i] = random.nextInt(100) + 1;
		}

		// Ordenación burbuja
		System.out.println("Ordenando...");

		long tiempoInicio = System.currentTimeMillis();

		boolean ordenado = false;
		int aux;
		for (int i = 0; i < numeros.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			for (int j = 0; j < numeros.length - 1 - i; j++)
			{

				if(numeros[j] > numeros[j+1])
				{
					ordenado = false;

					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}

		long tiempoFin = System.currentTimeMillis();

		System.out.println("Segundos: " + (tiempoFin - tiempoInicio) / 1000f);


		System.out.println("Array ordenado.");

		System.out.println("Números ordenados:");
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}


	}

}
