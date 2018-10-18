import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// Para leer cada nota
		float nota;
		// Cuenta las notas que igualan o superan la nota de corte
		int contNotas = 0;
		System.out.print("Número de notas: ");
		// Número de notas que se van a leer
		int numNotas = sc.nextInt();
		System.out.print("Nota de corte: ");
		float notaCorte = sc.nextFloat();
		for(int i = 0; i < numNotas; i++)
		{
			System.out.print("Nota: ");
			nota = sc.nextFloat();
			if(nota >= notaCorte)
			{
				contNotas++;
			}
		}
		sc.close();
		System.out.println("El número de notas que han igualado o superado la nota de corte es: " + contNotas);	
	}
}
