package sinrepetir;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int NUM = 7;
		int[] numeros = new int[NUM];
		int contNoRepetidos = 0;
		int aux;
		boolean encontrado;
		while(contNoRepetidos < NUM)
		{
			System.out.print("Número: ");
			aux = sc.nextInt();
			// Buscamos aux en el array
			encontrado = false;
			for (int i = 0; i < contNoRepetidos && !encontrado; i++)
			{
				if(aux == numeros[i])
				{
					encontrado = true;
				}
			}
			if(encontrado)
			{
				System.out.println("Repetido.");
			}
			else
			{
				numeros[contNoRepetidos] = aux;
				contNoRepetidos++;
			}
		}
		sc.close();
		System.out.println("Números introducidos:");
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}

}
