package mistring;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadena: ");
		String cadena = sc.nextLine();
		System.out.println(MiString.alReves(cadena));
		sc.close();

		MiString.limpiaCaracteres("abecedario", "aeiou");

	}

}
