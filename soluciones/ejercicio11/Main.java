public class Main
{
	public static void main(String[] args)
	{
		boolean tieneDivisor;
		System.out.print("2, ");
		int div;
		for(int num = 3; num <= 100; num+=2)
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
			}
		}
	}
}
