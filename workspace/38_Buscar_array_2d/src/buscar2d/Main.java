package buscar2d;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int FILAS = 4;
		final int COLS = 4;
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
		// Buscar repetidos
		boolean repetido = false;
		for (int fila = 0; fila < rectangulo.length && !repetido; fila++)
		{
			for (int col = 0; col < rectangulo[0].length && !repetido; col++)
			{
				for (int f = fila; f < rectangulo.length && !repetido; f++)
				{
					for (int c = 0; c < rectangulo.length && !repetido; c++)
					{
						if(rectangulo[fila][col] == rectangulo[f][c]
								&& (fila != f || col != c))
						{
							repetido = true;
						}
					}
				}
			}
		}
		if(repetido)
		{
			System.out.println("Hay algún repetido.");
		}
		else
		{
			System.out.println("No hay ningún repetido.");
		}

	}

}
