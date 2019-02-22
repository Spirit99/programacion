package calcula;

public class Main
{

	public static void main(String[] args)
	{
		double mayor = Calcula.mayor(1,2,3.5);
		System.out.println(mayor);

		int entero = (int) Calcula.mayor((double)1,2,3);
		System.out.println(entero);

		System.out.println(Calcula.menor(-2.5,3,4,5));

		System.out.println(Calcula.mayor(-3.5, -2));
		System.out.println(Calcula.mayor(-3.5, -2));


		System.out.println(Calcula.mayor("123", "1234"));
		System.out.println(Calcula.menor("123", "XXX"));

	}

}
