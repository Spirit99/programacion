package mayorcadena;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String maxCadena = "";

		System.out.print("Cadena: ");
		String cadena = sc.nextLine();

		while(!cadena.equals("fin"))
		{

			if(cadena.length() >= maxCadena.length())
			{
				maxCadena = cadena;
			}

			System.out.print("Cadena: ");
			cadena = sc.nextLine();
		}
		sc.close();
		if(maxCadena.length() == 0)
		{
			System.out.println("No se han introducido cadenas.");
		}
		else
		{
			System.out.println("Cadena más larga: " + maxCadena);
		}
	}
}
