package e105;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] dias = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};

		float totalRecaudacion;
		float min;
		float max;
		float recaudacion = 0;
		int iDiaMax = 0;
		int iDiaMin = 0;

		boolean empateMaximo = true;
		boolean empateMinimo = true;

		while(recaudacion != -1)
		{
			iDiaMax = 0;
			iDiaMin = 0;
			totalRecaudacion = 0;
			recaudacion = sc.nextFloat();
			if(recaudacion != -1)
			{

				totalRecaudacion += recaudacion;
				max = recaudacion;
				min = recaudacion;
				for (int i = 1; i <= 5; i++)
				{
					recaudacion = sc.nextFloat();
					totalRecaudacion += recaudacion;

					if(recaudacion == max)
					{
						empateMaximo = true;
					}

					if(recaudacion > max)
					{
						empateMaximo = false;
						max = recaudacion;
						iDiaMax = i;

					}
					if(recaudacion == min)
					{
						empateMinimo = true;
					}
					if(recaudacion < min)
					{
						empateMinimo = false;
						min = recaudacion;
						iDiaMin = i;
					}
				}
				System.out.println((empateMaximo ? "EMPATE" : dias[iDiaMax]) + " " + (empateMinimo ? "EMPATE" : dias[iDiaMin]) + " " + (recaudacion > (totalRecaudacion / 6) ? "SI" : "NO"));
			}
		}
		sc.close();

	}

}
