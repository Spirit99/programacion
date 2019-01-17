package mayusculas;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena: ");
		String cad = sc.nextLine();
		sc.close();
		if(cad.equals(cad.toUpperCase()))
		{
			System.out.println("Está en mayúsculas.");
		}
		else
		{
			System.out.println("No está todo en mayúsculas.");
		}
	}
}
