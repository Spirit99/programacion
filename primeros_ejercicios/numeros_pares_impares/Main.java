import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int contPares = 0;
		int contImpares = 0;
		int num;
		System.out.print("Número: ");
		num = sc.nextInt();
		while(num != 0)
		{
			if(num % 2 == 0)			
			{
				contPares++;
			}
			else
			{
				contImpares++;
			}
			System.out.print("Número: ");
			num = sc.nextInt();
		}
		sc.close();
		System.out.println("Total pares: " + contPares + ". Total impares: " + contImpares + ".");
	}
}
