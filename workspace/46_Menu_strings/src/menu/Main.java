package menu;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[10];
		String opcion = "";
		int cont = 0;

		String nombre;

		while(!opcion.equals("6"))
		{
			// Mostrar menú
			System.out.println("1.-Introducir nombre.\n" +
				"2.-Listar nombres.\n" +
				"3.-Buscar nombre.\n" +
				"4.-Eliminar nombre.\n" +
				"5.-Eliminar todos los nombres.\n" +
				"6.-Salir.");
			// Leer opción
			opcion = sc.nextLine();
			// Procesar la opción
			switch(opcion)
			{
				case "1": // Introducir nombre
					if(cont == nombres.length)
					{
						System.out.println("Lleno.");
					}
					else
					{
						System.out.print("Nombre:");
						nombre = sc.nextLine();


						boolean encontrado = false;
						for (int i = 0; i < cont && !encontrado; i++)
						{
							if(nombre.equalsIgnoreCase(nombres[i]))
							{
								encontrado = true;
							}
						}
						if(encontrado)
						{
							System.out.println("Ya existe.");
						}
						else
						{
							nombres[cont] = nombre;
							cont++;
						}

					}
				break;

				case "2": // Listar
					System.out.println("Listado:");
					for (int i = 0; i < cont; i++)
					{
						System.out.println(nombres[i]);
					}
				break;

				case "3": // Buscar nombre
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					nombre = nombre.toLowerCase();
					boolean encontrado = false;
					for (int i = 0; i < cont; i++)
					{
						if(nombres[i].toLowerCase().contains(nombre))
						{
							encontrado = true;
							System.out.println(nombres[i]);
						}
					}
					if(!encontrado)
					{
						System.out.println("No se encontró coincidecia.");
					}
				break;

				case "4": // Eliminar nombre
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					encontrado = false;
					int iBorrar = 0;
					for (int i = 0; i < cont && !encontrado; i++)
					{
						if(nombre.equalsIgnoreCase(nombres[i]))
						{
							encontrado = true;
							iBorrar = i;
						}
					}
					if(encontrado)
					{
						for (int i = iBorrar; i < cont - 1; i++)
						{
							nombres[i] = nombres[i + 1];
						}
						cont--;
					}
					else
					{
						System.out.println("No encontrado.");
					}

				break;

				case "5": // Eliminar todos
					cont = 0;
				break;

				case "6": // Salir
				break;

				default:
					System.out.println("Opción no válida.");
				break;
			}
		}
		sc.close();

	}

}
