/*
 * Leer números ascendentes hasta llenar un array de 5 elementos.
 * Si un número no supera al aterior, se muestra un mensaje,
 * y el número no es válido.
*/


package ejercicio2;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int NUM = 5;
		int[] nums = new int[NUM];

		System.out.print("Número: ");
		nums[0] =sc.nextInt();
		int cont = 1;

		while(cont < NUM)
		{
			System.out.print("Número: ");
			nums[cont] = sc.nextInt();
			if(nums[cont] > nums[cont -1])
			{
				cont++;
			}
			else
			{
				System.out.print("Ha de ser superior.");
			}
		}
		sc.close();
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i] + " ");
		}
	}

}
