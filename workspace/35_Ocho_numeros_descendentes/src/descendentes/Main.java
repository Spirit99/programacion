package descendentes;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int[] numeros = new int[8];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(numeros);
		System.out.println("Descendentes:");
		for (int i = numeros.length - 1; i >= 0; i--)
		{
			System.out.print(numeros[i] + " ");
		}
	}
}
