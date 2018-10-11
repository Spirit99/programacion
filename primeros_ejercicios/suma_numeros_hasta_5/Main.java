import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		while(num != 5)
		{
			suma += num; // suma = suma + num
			System.out.print("Número: ");
			num = sc.nextInt();
		}
		sc.close();
		System.out.println("La suma total es " + suma);
	}
}
