/*
 * Llenar un array de n elementos con el siguiente patrón:
 * 1 3 5 7 9 10 8 6 4 2
 * Pudiendo ser n par o impar.
 */

package ejercicio3_1;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Tamaño: ");
		final int NUM = sc.nextInt();
		sc.close();
		int[] serie = new int[NUM];
		int n = 1;
		for (int i = 0; i < NUM / 2; i++)
		{
			serie[i] = n;
			n += 2;
		}

		n = 2;

		for (int i = NUM - 1; i > NUM /2; i--)
		{
			serie[i] = n;
			n += 2;
		}

		if(NUM % 2 != 0)
		{
			n--;
		}
		serie[NUM / 2] = n;

		for (int i = 0; i < serie.length; i++)
		{
			System.out.print(serie[i] + " ");
		}

	}

}
