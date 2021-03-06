package maximafila;

import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		final int FILAS = 6;
		final int COLS = 4;
		int[][] rectangulo = new int[FILAS][COLS];
		Random random = new Random();
		int sumaFila;
		int maxSuma = Integer.MIN_VALUE;
		int iMaxFila = -1;
		for (int i = 0; i < rectangulo.length; i++)
		{
			sumaFila = 0;
			for (int j = 0; j < rectangulo[0].length; j++)
			{
				rectangulo[i][j] = random.nextInt(10) + 1;
				System.out.print(rectangulo[i][j] + "\t");
				sumaFila += rectangulo[i][j];
			}
			System.out.print("\n\n");
			if(sumaFila > maxSuma)
			{
				maxSuma = sumaFila;
				iMaxFila = i;
			}
		}
		System.out.println("La fila que más suma es la " + iMaxFila);

	}

}
