import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = -1;
		int suma = 0;
		while(num != 0)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			suma += num; // suma = suma + num
		}
		sc.close();
		System.out.println("La suma total es " + suma);

	}
}
