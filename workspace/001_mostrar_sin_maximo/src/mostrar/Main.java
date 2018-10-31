/*
 * Programa que lee 11 números desde consola y los lista
 * de nuevo exceptuando el valor máximo.
 */

package mostrar;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int NUM = 11;
		int[] numeros = new int[NUM];
		int maximo = Integer.MIN_VALUE;
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
			if(numeros[i] > maximo)
			{
				maximo = numeros[i];
			}
		}
		sc.close();
		System.out.println("Listado de números exceptuando el máximo:");
		for (int i = 0; i < numeros.length; i++)
		{
			if(numeros[i] != maximo)
			{
				System.out.println(numeros[i]);
			}
		}
	}

}
