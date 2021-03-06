package e474;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int s, a, b;
		int distancia = 0;

		int distancia1 = 0;
		int distancia2 = 0;


		for (int i = 0; i < casos; i++)
		{

			s = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();

			if(s == menor(a, b, s))
			{
				distancia = mayor(a, b) - s;
			}
			else if(s == mayor(a, b, s))
			{
				distancia = s - menor(a, b);
			}
			else // S está en el medio
			{
				distancia1 = s - menor(a, b);
				distancia2 = mayor(a, b) - s;
				distancia = menor(distancia1, distancia2) * 2 + mayor(distancia1, distancia2);
			}

			System.out.println(distancia);
		}
		sc.close();
	}

	public static int menor(int ... nums)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
	}


	public static int mayor(int ... nums)
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max;

	}

}
