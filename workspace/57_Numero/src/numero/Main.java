package numero;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println(Numero.esPrimo(127));

		System.out.println(Numero.esPerfecto(28));

		System.out.println(Numero.esCapicua(121));

		System.out.println(Numero.sonAmigos(220, 284));


		int[] nums = {10,9,8,7,6,5,4,3,2,1,0};

		Numero.ordena(nums, Numero.ASCENDENTE);


		mostrarArray(nums);

		System.out.println();
		Numero.ordena(nums, Numero.DESCENCENTE);

		mostrarArray(nums);


		int[] divisores = Numero.extraeDivisores(10);

		mostrarArray(divisores);

		Numero.duplica(divisores);

		mostrarArray(divisores);

		System.out.println(Numero.esPrimo(1));

		int[] conPrimos = {4,5,8,13,11,2,6};
		int[] sinPrimos = Numero.eliminaPrimos(conPrimos);

		mostrarArray(sinPrimos);

	}

	public static void mostrarArray(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}
