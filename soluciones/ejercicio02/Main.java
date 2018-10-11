import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int contValidos = 0;
		int contNoValidos = 0;
		int num;
		int maximo = 0;
		while(contValidos < 11)
		{
			System.out.print("Número (20..40): ");
			num = sc.nextInt();
			// Si el número es válido
			if(num >= 20 && num <= 40)
			{
				contValidos++;
				if(num > maximo)
				{
					maximo = num;
				}
			}
			else
			{
				contNoValidos++;
				System.out.println("El número no está entre 20 y 40.");
			}
		}
		sc.close();
		System.out.println("El máximo introducido es " + maximo + ".");
		System.out.println("Se han introducido " + contNoValidos + " números no válidos.");
	}
}
