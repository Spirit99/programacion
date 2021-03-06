package invertir;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		final int NUM = 10;
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[NUM];
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print("Número: ");
			nums[i] = sc.nextInt();
		}
		sc.close();
		// Mostrar array:
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		// Invertir array
		int aux;
		for (int i = 0; i < nums.length / 2; i++)
		{
			// nums[i] --- nums[nums.length - 1 - i]
			aux = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = aux;
		}
		// Mostrar
		System.out.println();
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
	}
}
