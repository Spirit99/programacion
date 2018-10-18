import java.util.Scanner;
public class Main
{
	
	public static void main(String[] args)
	{
		final int NUM = 87;
		Scanner sc = new Scanner(System.in);
		int maximo = 0;
		int contMaximo = 0;
		int num;

		System.out.print("Número: ");
		maximo = sc.nextInt();
		contMaximo = 1;
		for(int i = 0; i < NUM - 1; i++)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			if(num > maximo)
			{
				maximo = num;
				contMaximo = 1;
			}
			else if(num == maximo)
			{
				contMaximo++;
			}
		}
		sc.close();
		System.out.println("Máximo: " + maximo + " y se repite "
			+ contMaximo + " veces.");
	}
}
