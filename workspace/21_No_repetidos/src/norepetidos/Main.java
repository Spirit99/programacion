package norepetidos;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int NUM = 9;
		int[] numeros = new int[NUM];
		boolean repetido = false;
		int cont = 0;
		int aux;
		while(cont < NUM && !repetido)
		{
			System.out.print("Número: ");
			aux = sc.nextInt();
			for (int i = 0; i < cont && !repetido; i++)
			{
				if(aux == numeros[i])
				{
					repetido = true;
				}
			}
			if(!repetido)
			{
				numeros[cont] = aux;
				cont++;
			}
		}
		sc.close();
		System.out.println("Números introducidos:");
		for (int i = 0; i < cont; i++)
		{
			System.out.println(numeros[i]);
		}
	}

}
