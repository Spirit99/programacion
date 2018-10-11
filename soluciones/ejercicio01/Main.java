import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Número: ");
		num1 = sc.nextInt();
		System.out.print("Número: ");
		num2 = sc.nextInt();
		System.out.println("La suma es " + (num1 + num2));
		if(num2 != 0)
		{
			System.out.println("La división es " + ((float)num1 / num2));
		}
		else
		{
			System.out.println("División por cero no válida.");
		}

	}
}
