package e178;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numCasos = Integer.parseInt(sc.nextLine());
		String titular = "";
		String mensaje = "";

		int iMensaje = 0;

		for (int i = 0; i < numCasos; i++)
		{
			titular = sc.nextLine().toUpperCase().replaceAll(" ", "");
			mensaje = sc.nextLine().toUpperCase().replaceAll(" ", "");

			for (int iTitular = 0; iTitular < titular.length() && iMensaje < mensaje.length(); iTitular++)
			{
				if(titular.charAt(iTitular) == mensaje.charAt(iMensaje))
				{
					iMensaje++;
				}
			}

			if(iMensaje == mensaje.length())
			{
				System.out.println("SI");
			}
			else
			{
				System.out.println("NO");
			}


		}
		sc.close();
	}

}
