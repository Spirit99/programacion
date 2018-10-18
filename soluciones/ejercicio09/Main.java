import java.util.Scanner;
public class Main
{
	
	public static void main(String[] args)
	{
		final int INTENTOS = 10;
		Scanner sc = new Scanner(System.in);
		int adivinar;

		do
		{
			System.out.print("Número a adivinar (0..100): ");
			adivinar = sc.nextInt();
		}
		while(adivinar < 0 || adivinar > 100);


		int num;
		boolean numeroAdivinado = false;
		int contIntentos = 0;
		while(!numeroAdivinado && contIntentos < INTENTOS)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			
			if(num < adivinar)
			{
				System.out.println("No llegaste.");
			}
			else if(num > adivinar)
			{
				System.out.println("Te pasaste.");
			}
			else
			{
				numeroAdivinado = true;
			}			
			contIntentos++;
		}

		if(numeroAdivinado)
		{
			System.out.println("Acertaste.");
		}
		else
		{
			System.out.println("Intentos agotados.");
		}
		sc.close();
	}
}
