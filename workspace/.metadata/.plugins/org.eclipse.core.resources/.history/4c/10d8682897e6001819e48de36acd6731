/*
Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que busquemos un número entre
los introducidos, y nos dirá si ha sido encontrado o no. El programa nos preguntará si queremos seguir buscando más
números o no: “¿Desea seguir buscando números?(s/n)”.
 */
package buscar;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int NUM = 9;
		Scanner sc = new Scanner(System.in);
		String respuesta;
		int[] numeros = new int[NUM];
		int buscar;
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		boolean encontrado;
		do
		{

			System.out.print("Número a buscar: ");
			buscar = Integer.parseInt(sc.nextLine());
			encontrado = false;
			for (int i = 0; i < numeros.length && !encontrado; i++)
			{
				if(buscar == numeros[i])
				{
					encontrado = true;
				}
			}
			if(encontrado)
			{
				System.out.println("Encontrado.");
			}
			else
			{
				System.out.println("No encontrado.");
			}

			System.out.print("¿Seguir buscando? (s/n): ");
			respuesta = sc.nextLine();
		}
		while(respuesta.equals("s"));
		sc.close();
	}

}
