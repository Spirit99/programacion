package ordenar;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] palabras = new String[10];
		for (int i = 0; i < palabras.length; i++)
		{
			System.out.print("Palabra: ");
			palabras[i] = sc.nextLine();
		}
		sc.close();

		// Ordenación
		String aux;
		for (int i = 0; i < palabras.length -1; i++)
		{
			for (int j = 0; j < palabras.length - 1; j++)
			{
				if(palabras[j].compareTo(palabras[j + 1]) > 0)
				{
					aux = palabras[j];
					palabras[j] = palabras[j + 1];
					palabras[j + 1] = aux;
				}
			}
		}

		// Mostrar las palabras
		for (int i = 0; i < palabras.length; i++)
		{
			System.out.println(palabras[i]);
		}


	}

}
