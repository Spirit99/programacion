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
						int posInsercion = 0;
						while(aux > numeros[posInsercion] && posInsercion < cont)
						{
							posInsercion++;
						}
						if(aux == numeros[posInsercion] && posInsercion < cont)
						{
							System.out.println("Repetido.");
						}
						else
						{
							// Desplazar elementos
							for (int i = cont - 1; i >= posInsercion; i--)
							{
								numeros[i + 1] = numeros[i];
							}
							numeros[posInsercion] = aux;
							cont++;
						}
					}
					break;
				case 2: // Listar
					for (int i = 0; i < cont; i++)
					{
						System.out.print(numeros[i] + " ");
					}
					System.out.println();
					break;
				case 3: // Eliminar
					System.out.print("Número a eliminar: ");
					aux = sc.nextInt();
					encontrado = false;
					for (int i = 0; i < cont && !encontrado; i++)
					{
						if(numeros[i] == aux)
						{
							encontrado = true;
							// Número encontrado en la posición i
							for (int j = i; j < cont - 1; j++)
							{
								numeros[j] = numeros[j + 1];
							}

						}
					}
					if(encontrado)
					{
						cont--;
						System.out.println("Eliminado.");
					}
					else
					{
						System.out.println("No encontrado.");
					}
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
