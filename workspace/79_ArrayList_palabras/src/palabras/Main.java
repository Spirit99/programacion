package palabras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		ArrayList<String> alPalabras = new ArrayList<>();
		System.out.println("Introduce palabras separadas por un espacio:");
		String[] palabras = sc.nextLine().split(" ");
		for (int i = 0; i < palabras.length; i++)
		{
			alPalabras.add(palabras[i]);
		}
		System.out.println("Las palabras introducidas y ordenadas alfabéticamente han sido:");
		Collections.sort(alPalabras);
		mostrarPalabras(alPalabras);
		System.out.println("Las palabras introducidas y revueltas han sido:");
		Collections.shuffle(alPalabras);
		mostrarPalabras(alPalabras);
		System.out.println("Introduce una palabra a introducir en la posición 0:");
		alPalabras.add(0, sc.nextLine());
		System.out.println("Las palabras introducidas después de la inserción:");
		mostrarPalabras(alPalabras);
		System.out.println("Introduce una palabra a eliminar:");

	}

	private static void mostrarPalabras(ArrayList<String> arrayList)
	{
		for (String palabra: arrayList)
		{
			System.out.println(palabra);
		}
	}

}
