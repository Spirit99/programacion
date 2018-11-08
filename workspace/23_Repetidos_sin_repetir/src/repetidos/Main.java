package repetidos;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		final int NUM = 13;
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[NUM];
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		boolean repetido;
		System.out.println("Los repetidos sin repetir son:");
		for (int i = 0; i < numeros.length; i++)
		{
			repetido = false;
			for (int j = 0; j < numeros.length && !repetido; j++)
			{
				if(numeros[i] == numeros[j] && i != j)
				{
					repetido = true;
				}
			}
			if(repetido)
			{
				// numero[i] está repetido
				// Lo mostramos si es la
				// primera aparición en el array
				boolean esElPrimero = true;
				for(int j = i - 1; j >= 0 && esElPrimero; j--)
				{
					if(numeros[j] == numeros[i])
					{
						esElPrimero = false;
					}
				}
				if(esElPrimero)
				{
					System.out.println(numeros[i]);
				}
			}
		}
	}
}
