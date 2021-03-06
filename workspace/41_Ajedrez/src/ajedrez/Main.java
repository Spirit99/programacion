package ajedrez;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		final int FILAS = sc.nextInt();
		System.out.print("Columnas: ");
		final int COLS = sc.nextInt();
		int num;
		do
		{
			System.out.println("Valor inicial (0 ó 1): ");
			num = sc.nextInt();
		}
		while(num != 0 && num != 1);

		char cuadro = ' ';

		if(num == 1)
		{
			cuadro = '\u2588';
		}

		sc.close();
		char[][] ajedrez = new char[FILAS][COLS];
		for (int fila = 0; fila < ajedrez.length; fila++)
		{
			for (int col = 0; col < ajedrez[0].length; col++)
			{
				ajedrez[fila][col] = cuadro;
				if(cuadro == ' ')
				{
					cuadro = '\u2588';
				}
				else
				{
					cuadro = ' ';
				}
			}
			// Número de columnas par
			if(COLS % 2 == 0)
			{
				if(cuadro == ' ')
				{
					cuadro  = '\u2588';
				}
				else
				{
					cuadro = ' ';
				}
			}
		}
		// Mostrar
		for (int fila = 0; fila < ajedrez.length; fila++)
		{
			for (int col = 0; col < ajedrez[0].length; col++)
			{
				System.out.print(ajedrez[fila][col]);
			}
			System.out.print("\n");
		}

	}

}
