/*
 * Programa que lee desde consola 10 números pares. Si
 * el usuario metiera un número impar, no será tenido
 * en cuenta.
 * Al introducir los 10 pares, serán listados en el mismo
 * orden en el que fueron introducidos.
 */

package solopares;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int contPares = 0;
		final int NUM = 10;
		int[] numeros = new int[NUM];
		int aux;
		while(contPares < NUM)
		{
			System.out.print("Número: ");
			aux = sc.nextInt();
			if(aux % 2 == 0)
			{
				numeros[contPares] = aux;
				contPares++;
			}
			else
			{
				System.out.println("No es par.");
			}
		}
		sc.close();
		System.out.println("Números pares:");
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}

}
