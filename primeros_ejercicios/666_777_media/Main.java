import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		int suma = 0;
		System.out.print("Número: ");
		num = sc.nextInt();
		while(num != 666 && num != 777)
		{
			suma += num;
			cont++;			

			System.out.print("Número: ");
			num = sc.nextInt();
		}
		sc.close();
		if(cont != 0)
		{
			System.out.println("Media: " + suma / (float)cont);
		}
		else
		{
			System.out.println("No hay valores para calcular la media.");
		}
	}
}
