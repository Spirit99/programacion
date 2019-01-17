package eliminar;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena: ");
		String cadena = sc.nextLine();
		sc.close();
		System.out.println(cadena.replace("a", ""));

	}

}
