package magico;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int orden;
		do
		{
			System.out.print("Orden: ");
			orden = sc.nextInt();
		}
		while(orden % 2 == 0);
		sc.close();

		int[][] magico = new int[orden][orden];

		int fila = 0;
		int col = orden / 2;

		for (int num = 1; num <= orden * orden; num++)
		{
			magico[fila][col] = num;
			// Actualizar fila y col
			// Determinar tipo de movimiento
			if(num % orden != 0)
			{
				if(fila == 0)
				{
					fila = orden - 1;
				}
				else
				{
					fila--;
				}
				if(col == orden - 1)
				{
					col = 0;
				}
				else
				{
					col++;
				}
			}
			else
			{
				fila++;
			}
		}

		// Mostrar el cuadrado
		for (int i = 0; i < magico.length; i++)
		{
			for (int j = 0; j < magico[0].length; j++)
			{
				System.out.print(magico[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
	}
}
