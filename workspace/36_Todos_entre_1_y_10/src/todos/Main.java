package todos;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean[] numeros = new boolean[10];
		int cont = 0;
		int num;
		while(cont < numeros.length)
		{
			System.out.print("Número (1..10): ");
			num = sc.nextInt();
			if(num >= 1 && num <= 10)
			{
				if(numeros[num - 1] == false)
				{
					numeros[num - 1] = true;
					cont++;
				}
			}
			else
			{
				System.out.println("No válido.");
			}
		}
		sc.close();
	}

}
