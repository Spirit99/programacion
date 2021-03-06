package numero;

public class Numero
{

	public static final int ASCENDENTE = 0;
	public static final int DESCENCENTE = 1;


	private Numero()
	{

	}
	public static boolean esPrimo(int num)
	{
		if(num == 0 || num == 1)
		{
			return false;
		}
		for(int div = 2; div <= num / 2; div++)
		{
			if(num % div == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean esPerfecto(int num)
	{
		return num == sumaDivisores(num);
	}
	public static boolean esCapicua(int num)
	{
		String strNumero = num + "";
		for (int izq = 0, der = strNumero.length() - 1; izq < strNumero.length() / 2; izq++, der--)
		{
			if(strNumero.charAt(izq) != strNumero.charAt(der))
			{
				return false;
			}
		}
		return true;
	}



	public static boolean sonAmigos(int num1, int num2)
	{
		return sumaDivisores(num1) == num2 &&
				sumaDivisores(num2) == num1;
	}

	private static int sumaDivisores(int num)
	{
		int sumaDivisores = 0;
		for (int div = 1; div <= num / 2; div++)
		{
			if(num % div == 0)
			{
				sumaDivisores += div;
			}
		}
		return sumaDivisores;
	}

	public static int[] extraeDivisores(int num)
	{
		int contDivisores = 0;
		for (int div = 1; div <= num / 2; div++)
		{
			if(num % div == 0)
			{
				contDivisores++;
			}
		}

		int[] divisores = new int[contDivisores];
		int i = 0;
		for (int div = 1; div <= num / 2; div++)
		{
			if(num % div == 0)
			{
				divisores[i]= div;
				i++;
			}
		}
		return divisores;
	}
	public static void duplica(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] *= 2; // nums[i] = nums[i] * 2;
		}
	}
	public static void ordena(int[] nums, int tipo)
	{
		int aux;
		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if((tipo == ASCENDENTE && nums[i] > nums[j])
						||
					(tipo == DESCENCENTE && nums[i] < nums[j]))
				{
					aux = nums[j];
					nums[j] = nums[i];
					nums[i] = aux;
				}
			}
		}

	}

	public static int[] eliminaPrimos(int[] nums)
	{
		int contPrimos = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if(esPrimo(nums[i]))
			{
				contPrimos++;
			}
		}
		int[] sinPrimos = new int[nums.length - contPrimos];
		int j = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if(!esPrimo(nums[i]))
			{
				sinPrimos[j] = nums[i];
				j++;
			}
		}
		return sinPrimos;
	}


}
