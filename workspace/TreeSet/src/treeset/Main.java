package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Main
{

	public static void main(String[] args)
	{
		TreeSet<Integer> tsNumeros = new TreeSet<>();
		System.out.println(tsNumeros.add(6));
		System.out.println(tsNumeros.add(5));
		System.out.println(tsNumeros.add(4));
		System.out.println(tsNumeros.add(3));
		System.out.println(tsNumeros.add(2));
		System.out.println(tsNumeros.add(1));
		System.out.println(tsNumeros.add(0));

		System.out.println(tsNumeros.contains(1));

		System.out.println(tsNumeros.remove(2));

		System.out.println("El primero es: " + tsNumeros.first());
		System.out.println("El último es: " + tsNumeros.last());


		tsNumeros.size();

		for(int num : tsNumeros)
		{
			System.out.println(num);
		}

		Iterator<Integer> iterator = tsNumeros.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		tsNumeros.clear();

	}

}
