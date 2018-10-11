import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Rango desde 1 hasta: ");
		int fin = sc.nextInt();
		sc.close();
		System.out.println("Pares");
		for(int i = 2; i <= fin; i+=2) // i = i + 2
		{
			System.out.println(i);
		}
		System.out.println("Impares");
		for(int i = 1; i <= fin; i+=2)
		{
			System.out.println(i);
		}

	}
}
