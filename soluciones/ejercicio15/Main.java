import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int penultimo = 1;		
		int ultimo = 1;
		System.out.print("Longitud serie: ");
		int n = sc.nextInt();
		sc.close();
		if(n == 1)
		{
			System.out.print("1, ");
		}
		else if(n == 2)
		{
			System.out.print("1, 1, ");
		}
		else
		{
			System.out.print("1, 1, ");
			for(int i = 0; i < n - 2; i++)
			{
				num = penultimo + ultimo;
				System.out.print((penultimo + ultimo) + ", ");
				penultimo = ultimo;
				ultimo = num;
			}
		}
	}
}
