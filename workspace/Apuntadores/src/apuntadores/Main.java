package apuntadores;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Frase: ");
		String frase = sc.nextLine();
		sc.close();
		String[] palabras = frase.split(" ");
		for (int i = palabras.length - 1; i >= 0; i--)
		{
			System.out.print(palabras[i] + " ");
		}
	}

}
