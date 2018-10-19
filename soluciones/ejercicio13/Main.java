import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		final int NUM = 10;
		Scanner sc = new Scanner(System.in);
		int num;
		int maxMultiplo5 = Integer.MIN_VALUE;
		int minMultiplo3 = Integer.MAX_VALUE;
		for(int i = 0; i < NUM; i++)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			if(num % 5 == 0 && num > maxMultiplo5)
			{
				maxMultiplo5 = num;
			}
			if(num % 3 == 0 && num < minMultiplo3)
			{
				minMultiplo3 = num;
			}
		}
		sc.close();
		if(maxMultiplo5 != Integer.MIN_VALUE)
		{
			System.out.println("Máximo múltiplo de 5: " + maxMultiplo5);			
		}
		else
		{
			System.out.println("No se han introducido múltiplos de 5.");		
		}
		if(minMultiplo3 != Integer.MAX_VALUE)
		{
			System.out.println("Mínimo múltiplo de 3: " + minMultiplo3);			
		}
		else
		{
			System.out.println("No se han introducido múltiplos de 3.");		
		}


	}
}
