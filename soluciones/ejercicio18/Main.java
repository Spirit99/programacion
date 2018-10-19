import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		int num;
		int suma = 0;
		while(!cadena.equals("fin"))
		{
			System.out.print("Cadena: ");
			cadena = sc.nextLine();
			System.out.print("Número: ");
			num = Integer.parseInt(sc.nextLine());
			suma += num;
		}
		sc.close();
		System.out.print("Suma: " + suma + ".");
		System.out.println("Fin.");
	}
}
