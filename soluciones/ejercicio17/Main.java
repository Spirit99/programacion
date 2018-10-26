import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Número 1: ");
		int a = sc.nextInt();
		System.out.print("Número 2: ");
		int b = sc.nextInt();
		System.out.print("Número 3: ");
		int c = sc.nextInt();
		int aux;
		sc.close();
		if(a < b)
		{
			aux = a;
			a = b;
			b = aux;
		}
		if(b < c)
		{
			aux = b;
			b = c;
			c = aux;
		}
		if(a < b)
		{
			aux = a;
			a = b;
			b = aux;
		}
		System.out.println("Ordenados: " + a + ", " + b + ", " + c);
	}
}
