import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int num = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			suma = suma + num; // suma += num;
		}
		System.out.println("La suma de todos es " + suma);
		sc.close();
	}
}
