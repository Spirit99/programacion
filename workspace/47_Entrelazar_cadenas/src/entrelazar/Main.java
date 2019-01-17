package entrelazar;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena 1: ");
		String cad1 = sc.nextLine();
		System.out.print("Cadena 2: ");
		String cad2 = sc.nextLine();
		sc.close();
		String aux = "";

		int menor;
		if(cad1.length() < cad2.length())
		{
			menor = cad1.length();
		}
		else
		{
			menor = cad2.length();
		}

		// Cad1 siempre va a ser la de menor longitud

		for (int i = 0; i < menor; i++)
		{
			aux += cad1.charAt(i) + "" + cad2.charAt(i);
		}


		// Si no son iguales

		if(cad2.length() > cad1.length())
		{
			aux += cad2.substring(cad1.length());
		}
		else
		{
			aux += cad1.substring(cad2.length());
		}

		System.out.println(aux);
	}
}
