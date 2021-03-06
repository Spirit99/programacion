/*
 * Llenar un array de n elementos con el siguiente patrón:
 * 1 3 5 7 9 10 8 6 4 2
 * Pudiendo ser n par o impar.
 */

package ejercicio3;

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
		int iIzquierda = 0;
		int iDerecha = NUM - 1;
		for (int i = 0; i < NUM / 2; i++)
		{
			serie[iIzquierda] = n;
			iIzquierda++;
			n++;

			serie[iDerecha] = n;
			iDerecha--;
			n++;
		}

		if(NUM % 2 != 0)
		{
			serie[NUM / 2] = n;
		}


		for (int i = 0; i < serie.length; i++)
		{
			System.out.print(serie[i] + " ");
		}

	}

}
