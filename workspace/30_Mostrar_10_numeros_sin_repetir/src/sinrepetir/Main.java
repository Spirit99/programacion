package sinrepetir;

import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		final int NUM = 10;
		int[] numeros = new int[NUM];
		Random random = new Random();
		boolean encontrado;
		int contNoRepetidos = 0;
		int aux;
		while(contNoRepetidos < NUM)
		{
			aux = random.nextInt(100) + 1;
			encontrado = false;
			for (int i = 0; i < contNoRepetidos && !encontrado; i++)
			{
				if(aux == numeros[i])
				{
					encontrado = true;
				}
			}
			if(!encontrado)
			{
				numeros[contNoRepetidos] = aux;
				contNoRepetidos++;
			}
		}
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print(numeros[i] + " ");
		}
	}

}
