package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Main
{

	public static void main(String[] args)
	{
		HashSet<String> hashSet = new HashSet<>();

		System.out.println("uno".hashCode());
		System.out.println("UNO".hashCode());


		System.out.println(hashSet.add("uno"));
		System.out.println(hashSet.add("UNO"));
		System.out.println(hashSet.add("DOS"));
		System.out.println(hashSet.add("TRES"));
		System.out.println(hashSet.add("CUATRO"));
		System.out.println(hashSet.add("CINCO"));


		System.out.println(hashSet.remove("uno"));

		System.out.println(hashSet.contains("uno"));
		System.out.println(hashSet.contains("UNO"));


		System.out.println(hashSet.size());

		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext())
		{
			String cadena = iterator.next();
			if(cadena.equals("TRES"))
			{
				iterator.remove();
			}
			System.out.println(cadena);
		}

		System.out.println("Con un bucle for:");
		for(String cadena :hashSet)
		{
			System.out.println(cadena);
		}



		hashSet.clear();
	}

}
