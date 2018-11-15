package menu;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		final int NUM = 5;
		int[] numeros = new int[NUM];
		int cont = 0;
		boolean encontrado;
		int aux;
		while(opcion != 5)
		{
			System.out.println("Menú:\n1.­ Introducir número entero.\n2.­ Listar números.\n3.­ Eliminar número.\n4.­ Eliminar todos los números.\n5.­ Salir.");
			opcion = sc.nextInt();
			switch(opcion)
			{
				case 1: // Introducir
					if(cont == NUM)
					{
						System.out.println("Lleno.");
					}
					else
					{
						System.out.print("Número: ");
						aux = sc.nextInt();
						encontrado = false;
						for (int i = 0; i < cont && !encontrado; i++)
						{
							if(aux == numeros[i])
							{
								encontrado = true;
							}
						}
						if(!encontrado)
						{
							numeros[cont] = aux;
							cont++;
						}
						else
						{
							System.out.println("Repetido.");
						}
					}
					break;
				case 2: // Listar
					for (int i = 0; i < cont; i++)
					{
						System.out.print(numeros[i]);
					}
					break;
				case 3: // Eliminar

					break;
				case 4: //Eliminar todos
					cont = 0;
					break;
				case 5: // Salir

					break;
			}
		}
		sc.close();
	}
}
