package aleatorios;

import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		Random random = new Random();
		// 1 65%
		// X 20%
		// 2 15%
		int resultado;
		for (int i = 0; i < 15; i++)
		{
			System.out.print(i + 1 + " - ");
			resultado = random.nextInt(100);
			if(resultado <= 64)
			{
				System.out.println("1");
			}
			else if(resultado <= 84)
			{
				System.out.println(" X");
			}
			else
			{
				System.out.println("  2");
			}
		}

	}

}
