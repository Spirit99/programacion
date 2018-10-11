import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
		int num = sc.nextInt();
		boolean divisorEncontrado = false;
		int div = 2;
		while(!divisorEncontrado && div <= num / 2)
		{
			if(num % div == 0)
			{
				divisorEncontrado = true;
			}
			div++;
		}
		if(divisorEncontrado || num == 1) // divisorEncontrado == true
		{
			System.out.println("No es primo.");
		}
		else
		{
			System.out.println("Es primo.");
		}
	}
}
