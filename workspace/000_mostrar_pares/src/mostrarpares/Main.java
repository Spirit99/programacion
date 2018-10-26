package mostrarpares;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];

		boolean seHanIntroducidoPares = false;

		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Numero: ");
			numeros[i] = sc.nextInt();
			if(numeros[i] % 2 == 0)
			{
				seHanIntroducidoPares = true;
			}
		}
		sc.close();
		if(seHanIntroducidoPares)
		{
			System.out.println("Pares introducidos:");
			for (int i = 0; i < numeros.length; i++)
			{
				if(numeros[i] % 2 == 0)
				{
					System.out.println(numeros[i]);
				}
			}
		}
		else
		{
			System.out.println("No había pares.");
		}
	}

}
