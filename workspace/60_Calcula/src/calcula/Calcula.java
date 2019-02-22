package calcula;

public class Calcula
{

	private Calcula()
	{

	}

	public static double mayor(double ... nums)
	{
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max;
	}

	public static int mayor(int ... nums)
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max;
	}

	public static double menor(double ... nums)
	{
		double min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
	}

	public static int menor(int ... nums)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
	}

	public static String mayor(String ... strings)
	{
		String mayor = strings[0];
		for (int i = 0; i < strings.length; i++)
		{
			if(strings[i].length() > mayor.length())
			{
				mayor = strings[i];
			}
		}
		return mayor;
	}

	public static String menor(String ... strings)
	{
		String menor = strings[0];

		for (int i = 0; i < strings.length; i++)
		{
			if(strings[i].length() < menor.length())
			{
				menor = strings[i];
			}
		}
		return menor;
	}

}
