import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
		int num1 = sc.nextInt();
		System.out.print("Número: ");
		int num2 = sc.nextInt();
		while(num1 != num2)
		{
			num1 = num2;
			System.out.print("Número: ");
			num2 = sc.nextInt();
		}
		sc.close();
	}
}
