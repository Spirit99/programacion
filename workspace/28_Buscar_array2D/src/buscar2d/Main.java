package buscar2d;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int FILAS = 3;
		final int COLS = 2;
		int[][] tabla = new int[FILAS][COLS];
		for (int fila = 0; fila < tabla.length; fila++)
		{
			for (int col = 0; col < tabla[0].length; col++)
			{
				System.out.print("Número: ");
				tabla[fila][col] = Integer.parseInt(sc.nextLine());
			}
		}

		String respuesta;
		int buscar;
		boolean encontrado;
		do
		{
			// Mostrar array 2d
			for (int fila = 0; fila < tabla.length; fila++)
			{
				for (int col = 0; col < tabla[0].length; col++)
				{
					System.out.print(tabla[fila][col] + "\t");
				}
				System.out.print("\n\n");
			}
			// Pedir número a buscar
			System.out.print("Buscar: ");
			buscar = Integer.parseInt(sc.nextLine());
			// Buscar
			int filaEncontrado = 0;
			int colEncontrado = 0;
			encontrado = false;
			for (int fila = 0; fila < tabla.length && !encontrado; fila++)
			{
				for (int col = 0; col < tabla[0].length && !encontrado; col++)
				{
					if(tabla[fila][col] == buscar)
					{
						encontrado = true;
						filaEncontrado = fila;
						colEncontrado = col;
					}
				}
			}
			if(encontrado)
			{
				System.out.println("Encontrado en fila " +
						filaEncontrado + " y columna " +
						colEncontrado);
			}
			else
			{
				System.out.println("No encontrado.");
			}
			System.out.print("¿Desea seguir buscando números?(s/n)");
			respuesta = sc.nextLine();
		}
		while(respuesta.equalsIgnoreCase("s"));
		sc.close();

	}

}
