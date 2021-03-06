package sumasfilas;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLS = 3;
		int[][] rectangulo = new int[FILAS][COLS];
		Scanner sc = new Scanner(System.in);
		for (int fila = 0; fila < rectangulo.length; fila++)
		{
			for (int col = 0; col < rectangulo[0].length; col++)
			{
				System.out.print("Número [" + fila + "][" +
						col + "]:");
				rectangulo[fila][col] = sc.nextInt();
			}
		}
		sc.close();
		// Mostrar el array 2d
		for (int fila = 0; fila < rectangulo.length; fila++)
		{
			for (int col = 0; col < rectangulo[0].length; col++)
			{
				System.out.print(rectangulo[fila][col] + "\t");
			}
			System.out.print("\n\n");
		}
		boolean sumaIgual = true;
		int sumaFila = 0;
		int sumaPrimeraFila = 0;
		for (int fila = 0; fila < rectangulo.length && sumaIgual; fila++)
		{
			sumaFila = 0;
			for (int col = 0; col < rectangulo[0].length; col++)
			{
				sumaFila += rectangulo[fila][col];
			}
			if(fila == 0)
			{
				sumaPrimeraFila = sumaFila;
			}
			else if(sumaFila != sumaPrimeraFila)
			{
				sumaIgual = false;
			}
		}
		if(sumaIgual)
		{
			System.out.println("Todas las filas suman lo mismo.");
		}
		else
		{
			System.out.println("No todas las filas suman lo mismo.");
		}

	}

}
