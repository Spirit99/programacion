package menu;

import java.util.Scanner;

import nombres.Nombres;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String opcion = "";

		Nombres nombres = new Nombres(10);


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
					if(nombres.estaLlena())
					{
						System.out.println("Lleno.");
					}
					else
					{
						System.out.print("Nombre: ");
						nombre = sc.nextLine();
						if(nombres.buscarNombre(nombre))
						{
							System.out.println("Repetido.");
						}
						else
						{
							nombres.anadir(nombre);
						}
					}
				break;

				case "2": // Listar
					for (int i = 0; i < nombres.getNumeroNombres(); i++)
					{
						System.out.println(nombres.getNombre(i));
					}
				break;

				case "3": // Buscar nombre
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					if(nombres.buscarNombre(nombre))
					{
						System.out.println("Encontrado.");
					}
					else
					{
						System.out.println("No encontrado.");
					}

				break;

				case "4": // Eliminar nombre
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					if(nombres.eliminar(nombre))
					{
						System.out.println("Eliminado.");
					}
					else
					{
						System.out.println("No encontrado.");
					}
				break;

				case "5": // Eliminar todos
					nombres.vaciar();
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
