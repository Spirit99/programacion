package e219;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int contPares;
		int num;
		int aux;
		for (int i = 0; i < casos; i++)
		{
			contPares = 0;
			num = sc.nextInt();
			for (int j = 0; j < num; j++)
			{
				aux = sc.nextInt();
				if(aux % 2 == 0)
					contPares++;
			}
			System.out.println(contPares);
		}
		sc.close();

	}

}
