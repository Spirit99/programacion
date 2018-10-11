import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.close();
		for(int div = 1; div <= num / 2; div++)
		{
			if(num % div == 0)
			{
				System.out.println(div);
			}
		}
	}
}
