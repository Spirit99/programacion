package sinrepetir;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int[] numeros = {1,2,3,4,5,6,7,8,8,8,8,8};
		Scanner sc = new Scanner(System.in);
		int aux;
		System.out.print("Número a buscar:");
		aux = sc.nextInt();
		boolean encontrado = false;
		for (int i = 0; i < numeros.length && !encontrado; i++)
		{
			if(aux == numeros[i])
			{
				encontrado = true;
			}
		}
		sc.close();
		if(encontrado)
		{
			System.out.println("Encontrado");
		}
		else
		{
			System.out.println("No encontrado");
		}
	}

}
