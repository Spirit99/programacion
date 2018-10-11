import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		do
		{
			System.out.print("Número: ");
			num = sc.nextInt();
		}
		while(num != -1);
		sc.close();
		System.out.println("Fin del programa.");
	}
}
