package palabras;

import java.util.HashSet;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		HashSet<String> hsPalabras = new HashSet<String>();
		while(!opcion.equals("7"))
		{
			mostrarMenu();
			opcion = sc.nextLine();
			switch(opcion)
			{
				case "1": // Introducir
					System.out.print("Palabra: ");
					if(!hsPalabras.add(sc.nextLine()))
					{
						System.out.println("Ya existe.");
					}
					break;
				case "2": // Listar
					for(String palabra: hsPalabras)
					{
						System.out.println(palabra);
					}
					break;
				case "3": // Eliminar
					System.out.print("Palabra: ");
					if(!hsPalabras.remove(sc.nextLine()))
					{
						System.out.println("Palabra no encontrada.");
					}
					break;
				case "4": // Borrar todas
					hsPalabras.clear();
					break;
				case "5": // Mostrar tamaño
					System.out.println(hsPalabras.size());
					break;
				case "6": // Buscar
					System.out.print("Palabra: ");
					if(hsPalabras.contains(sc.nextLine()))
					{
						System.out.println("Encontrada.");
					}
					else
					{
						System.out.println("No encontrada.");
					}
					break;
				case "7": // Salir
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}
		sc.close();
	}

	private static void mostrarMenu()
	{
		System.out.println("Opciones\n" +
		"1.-Introducir palabra\n" +
		"2.-Listar palabras\n" +
		"3.-Eliminar palabra\n" +
		"4.-Borrar todas\n" +
		"5.-Mostrar tamaño\n" +
		"6.-Buscar\n" +
		"7.-Salir");
	}

}
