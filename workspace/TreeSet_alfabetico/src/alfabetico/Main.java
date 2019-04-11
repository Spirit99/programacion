package alfabetico;

import java.util.Scanner;
import java.util.TreeSet;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<Palabra> tsPalabras = new TreeSet<>();
		System.out.print("Palabra: ");
		String palabra = sc.nextLine();
		while(!palabra.equalsIgnoreCase("fin"))
		{
			if(!tsPalabras.add(new Palabra(palabra)))
			{
				System.out.println("Ya existe.");
			}
			System.out.print("Palabra: ");
			palabra = sc.nextLine();
		}
		sc.close();
		for(Palabra pal: tsPalabras)
		{
			System.out.println(pal.getPalabra());
		}

	}

}
