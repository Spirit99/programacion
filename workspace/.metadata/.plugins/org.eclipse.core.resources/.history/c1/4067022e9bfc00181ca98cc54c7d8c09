package sinrepetirimpares;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int NUM = 12;
		int[] impares = new int[NUM];
		int cont = 0;
		int aux;
		boolean encontrado;
		while(cont < NUM)
		{
			System.out.print("Número impar: ");
			aux = sc.nextInt();
			if(aux % 2 != 0)
			{
				encontrado = false;
				for (int i = 0; i < cont && !encontrado; i++)
				{
					if(aux == impares[i])
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
					impares[cont] = aux;
					cont++;
				}
			}
			else
			{
				System.out.println("Debe ser impar.");
			}
		}
		sc.close();
	}
}
