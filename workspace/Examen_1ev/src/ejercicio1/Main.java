/*
 * Programa que lee números desde cosola hasta que se
 * introduce un número perfecto. (6,28,496)
 */


package ejercicio1;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int suma;

		do
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			// Calcular divisores de num
			suma = 0;
			for (int div = 1; div <= num / 2; div++)
			{
				if(num % div == 0)
				{
					suma += div;
				}
			}


		}
		while(num != suma || num == 0);
		/*
		boolean esPerfecto = false;

		while(!esPerfecto)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			// Calcular divisores de num
			suma = 0;
			for (int div = 1; div <= num / 2; div++)
			{
				if(num % div == 0)
				{
					suma += div;
				}
			}
			if(suma == num && num != 0)
			{
				esPerfecto = true;
			}
		}
		*/
		sc.close();
		System.out.println(num + " es perfecto.");
	}

}
