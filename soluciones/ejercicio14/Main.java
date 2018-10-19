import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int num;
		System.out.print("Número: ");
		num = sc.nextInt();
		sc.close();
		for(int div = 1; div <= num / 2; div++)
		{
			if(num % div == 0)
			{
				suma += div;
			}
		}
		System.out.println("Suma de los divisores: " + suma);
	}
}
