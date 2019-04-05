package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main
{

	public static void main(String[] args)
	{
		ArrayList<Long> alNumeros = new ArrayList<>();

		alNumeros.add(1l);
		alNumeros.add(2l);
		alNumeros.add(3l);
		alNumeros.add(4l);
		alNumeros.add(5l);
		alNumeros.add(0,0l);

		System.out.println(alNumeros.contains(5l));
		System.out.println(alNumeros.contains(100000l));

		alNumeros.remove(4);
		alNumeros.remove(3l);

		for (int i = 0; i < alNumeros.size(); i++)
		{
			System.out.println(alNumeros.get(i));
		}

		for (long num: alNumeros)
		{
			System.out.println(num);
		}

		Iterator<Long> iterator = alNumeros.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		System.out.println(alNumeros.indexOf(2l));


		alNumeros.clear();

	}

}
