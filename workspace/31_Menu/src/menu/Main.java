package menu;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		while(opcion != 5)
		{
			System.out.println("Menú:\n1.­ Introducir número entero.\n2.­ Listar números.\n3.­ Eliminar número.\n4.­ Eliminar todos los números.\n5.­ Salir.");
			opcion = sc.nextInt();
			switch(opcion)
			{
				case 1: // Introducir
					System.out.println("Número: ");

					break;
				case 2: // Listar

					break;
				case 3: // Eliminar

					break;
				case 4: //Eliminar todos

					break;
				case 5: // Salir

					break;
			}
		}
		sc.close();
	}
}
