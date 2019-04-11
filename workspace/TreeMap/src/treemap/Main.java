package treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class Main
{

	public static void main(String[] args)
	{
		TreeMap<String, Integer> tmPersonas = new TreeMap<>();

		System.out.println(tmPersonas.put("uno",1));
		System.out.println(tmPersonas.put("dos",2));
		System.out.println(tmPersonas.put("tres",3));
		System.out.println(tmPersonas.put("cuatro",4));
		System.out.println(tmPersonas.put("cinco",5));
		System.out.println(tmPersonas.put("UNO",1));
		System.out.println(tmPersonas.put("uno",2));

		System.out.println(tmPersonas.containsKey("uno"));
		System.out.println(tmPersonas.containsKey("dos"));

		System.out.println(tmPersonas.remove("uno"));
		System.out.println(tmPersonas.remove("uno"));

		System.out.println(tmPersonas.firstKey());
		System.out.println(tmPersonas.lastKey());

		for(String nombre: tmPersonas.keySet())
		{
			System.out.println(nombre + ": " + tmPersonas.get(nombre));
		}

		Iterator<String> iterator = tmPersonas.keySet().iterator();
		String nombre;
		while(iterator.hasNext())
		{
			nombre = iterator.next();
			System.out.println(nombre + ": " + tmPersonas.get(nombre));
			// iterator.remove();
		}
		System.out.println("Número de elementos: " + tmPersonas.size());
		tmPersonas.clear();

	}

}
