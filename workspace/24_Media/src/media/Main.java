package media;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{

		final int NUM = 20;
		float[] numeros = new float[NUM];
		Scanner sc = new Scanner(System.in);
		float suma = 0;
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextFloat();
			suma += numeros[i];
		}
		sc.close();
		float media = suma / NUM;
		System.out.println("Media: " + media);
		System.out.println("Superiores a la media:");
		for (int i = 0; i < numeros.length; i++)
		{
			if(numeros[i] > media)
			{
				System.out.println(numeros[i]);
			}
		}
	}
}
