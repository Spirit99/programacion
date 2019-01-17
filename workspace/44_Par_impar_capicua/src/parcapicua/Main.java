package parcapicua;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.close();
		if(num == 0)
		{
			System.out.println(num + " es par.");
		}
		else
		{
			if(num % 2 == 0)
			{
				System.out.println(num + " es par.");
			}
			else
			{
				System.out.println(num + " es impar.");
			}
		}
		boolean esCapicua = true;
		String strNum = String.valueOf(num);

		for (int izq = 0, der = strNum.length() - 1; izq < der && esCapicua; izq++, der--)
		{
			if(strNum.charAt(izq) != strNum.charAt(der))
			{
				esCapicua = false;
			}
		}
		if(esCapicua)
		{
			System.out.println(num + " es capicúa.");
		}
		else
		{
			System.out.println(num + " no es capicúa.");
		}

	}
}
