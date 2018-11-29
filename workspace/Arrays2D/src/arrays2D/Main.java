package arrays2D;

public class Main
{

	public static void main(String[] args)
	{
		int[][] rectangulo = new int[5][7];
		int cont = 1;
		for (int fila = 0; fila < rectangulo.length; fila++)
		{
			for (int col = 0; col < rectangulo[0].length; col++)
			{
				rectangulo[fila][col] = cont;
				cont++;
			}
		}

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
