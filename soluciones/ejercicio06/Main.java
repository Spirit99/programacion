import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		final int CANTIDAD = 9;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("Número: ");
		int primero = sc.nextInt();
		int suma = primero;
		for(int i = 0; i < 8; i++)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			suma += num;
		}
		if(primero == num)
		{
			System.out.println("Media: " + suma / 9f);
		}
		sc.close();
	}
}
