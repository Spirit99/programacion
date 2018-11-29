package recorrido1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		final int FILAS = sc.nextInt();
		System.out.print("Columnas: ");
		final int COLUMNAS = sc.nextInt();
		sc.close();
		int[][] rectangulo = new int[FILAS][COLUMNAS];
		int cont = 1;


		for (int col = rectangulo[0].length - 1; col >= 0;col--)
		{
			for (int fila = rectangulo.length - 1; fila >= 0; fila--)
			{
				rectangulo[fila][col] = cont;
				cont++;
			}
		}

		// Mostrar
		for (int fila = 0; fila < rectangulo.length; fila++)
		{
			for (int col = 0; col < rectangulo[0].length; col++)
			{
				System.out.print(rectangulo[fila][col] + "\t");
			}
			System.out.print("\n\n");
		}
	}
}
