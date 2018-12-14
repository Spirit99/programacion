package menustrings;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		final int NUM = 8;
		String[] cadenas = new String[NUM];
		int cont = 0;
		boolean encontrada;
		String aux;
		while(!opcion.equals("5"))
		{
			System.out.println("Menú:\n1.­ Introducir cadena.\n2.­ Listar cadenas.\n3.­ Eliminar cadena.\n4.­ Eliminar todas las cadenas.\n5.­ Salir.");
			opcion = sc.nextLine();
			switch(opcion)
			{
				case "1": // Introducir
					if(cont == cadenas.length)
					{
						System.out.println("Lleno.");
					}
					else
					{
						System.out.print("Cadena: ");
						aux = sc.nextLine();
						encontrada = false;
						for (int i = 0; i < cont && !encontrada; i++)
						{
							if(aux.equals(cadenas[i]))
							{
								encontrada = true;
							}
						}
						if(encontrada)
						{
							System.out.println("Ya existe.");
						}
						else
						{
							cadenas[cont] = aux;
							cont++;
						}
					}
					break;
				case "2": // Listar
					for (int i = 0; i < cont; i++)
					{
						System.out.println(cadenas[i]);
					}
					break;
				case "3": // Eliminar
					System.out.print("Cadena a eliminar: ");
					aux = sc.nextLine();
					encontrada = false;
					int posEliminar = -1;
					for (int i = 0; i < cont && !encontrada; i++)
					{
						if(aux.equals(cadenas[i]))
						{
							encontrada = true;
							posEliminar = i;
						}
					}
					if(encontrada)
					{
						for (int i = posEliminar; i < cont - 1; i++)
						{
							cadenas[i] = cadenas[i + 1];
						}
						cont--;
						System.out.println("Eliminada.");
					}
					else
					{
						System.out.println("No encontrada.");
					}
					break;
				case "4": //Eliminar todas
					cont = 0;
					break;
				case "5": // Salir

					break;
			}
		}
		sc.close();
	}
}
