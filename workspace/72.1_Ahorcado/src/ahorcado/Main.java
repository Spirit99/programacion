package ahorcado;

import java.util.Scanner;

import application.Ahorcado;

public class Main
{

	private static Ahorcado ahorcado;
	private static final int NUM_MAX_FALLOS = 10;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ahorcado = new Ahorcado();

		String otraPartida = "S";
		String frase;

		while(otraPartida.equalsIgnoreCase("S"))
		{
			System.out.print("Frase a advinar: ");
			frase = sc.nextLine();
			ahorcado.partidaNueva(frase);

			while(ahorcado.getNumeroFallos() < NUM_MAX_FALLOS && !ahorcado.panelCompleto())
			{
				System.out.println(ahorcado.getPanel());

				System.out.println("Intentos restantes: " + (NUM_MAX_FALLOS - ahorcado.getNumeroFallos()));

				System.out.print("Letra: ");

				ahorcado.ponerLetra(sc.nextLine().charAt(0));

			}

			if(ahorcado.getNumeroFallos() == NUM_MAX_FALLOS)
			{
				System.out.println("Has perdido.");
				System.out.println(frase);
			}
			else
			{
				System.out.println("¡Ganaste!");
			}

			System.out.print("¿Otra partida? (S/N)");
			otraPartida = sc.nextLine();
		}
		sc.close();

	}

}
