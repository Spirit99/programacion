package alreves;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Frase: ");
		String frase = sc.nextLine();
		sc.close();
		for (int i = frase.length() - 1; i >= 0 ; i--)
		{
			System.out.print(frase.charAt(i));
		}
		System.out.println();
	}

}
