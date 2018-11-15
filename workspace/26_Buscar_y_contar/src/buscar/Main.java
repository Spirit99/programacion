/*
Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que busquemos un número entre
los introducidos, y nos dirá cuántas veces se ha encontrado. El programa nos preguntará si queremos seguir buscando más
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
		int cont;
		do
		{

			System.out.print("Número a buscar: ");
			buscar = Integer.parseInt(sc.nextLine());
			cont = 0;
			for (int i = 0; i < numeros.length; i++)
			{
				if(buscar == numeros[i])
				{
					cont++;
				}
			}
			if(cont > 0)
			{
				System.out.println("Número de veces encontrado: " + cont);
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
