package mostrarsinrepetir;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int NUM = 10;
		int[] numeros = new int[NUM];
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Números sin repetidos:");
		boolean encontrado;
		for (int i = 0; i < numeros.length; i++)
		{
			encontrado = false;
			for (int j = i - 1; j >= 0 && !encontrado; j--)
			{
				if(numeros[i] == numeros[j])
				{
					encontrado = true;
				}
			}
			if(!encontrado)
			{
				System.out.println(numeros[i]);
			}
		}
	}

}
