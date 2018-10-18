public class Main
{
	public static void main(String[] args)
	{
		final int NUM = 100;
		int contPrimos = 0;
		boolean tieneDivisor;
		System.out.print("2, ");
		int div;
		int num = 3;
		while(contPrimos < NUM - 1)
		{
			tieneDivisor = false;
			div = 2;
			while(!tieneDivisor && div <= num / 2)
			{
				if(num % div == 0)
				{
					tieneDivisor = true;
				}
				div++;
			}
			if(!tieneDivisor)
			{
				System.out.print(num + ", ");
				contPrimos++;
			}
			num = num + 2;
		}
	}
}
