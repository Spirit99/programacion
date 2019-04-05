package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Main
{

	public static void main(String[] args)
	{
		HashMap<String, Integer> hmMatriculas = new HashMap<>();

		System.out.println(hmMatriculas.put("4545FVG", 0));
		System.out.println(hmMatriculas.put("4545FVG", 3));
		System.out.println(hmMatriculas.put("4545FVG", 5));
		System.out.println(hmMatriculas.put("1111FVG", 5));
		System.out.println(hmMatriculas.put("2222FVG", 6));
		System.out.println(hmMatriculas.put("3333FVG", 7));

		String m = "3333FVG";
		hmMatriculas.put(m, hmMatriculas.get(m) + 10);


		System.out.println(hmMatriculas.containsKey("4545FVG"));
		System.out.println(hmMatriculas.containsKey("0000JJJ"));

		System.out.println(hmMatriculas.containsValue(5));
		System.out.println(hmMatriculas.containsValue(44));

		System.out.println(hmMatriculas.get("4545FVG"));
		System.out.println(hmMatriculas.get("0000FVG"));

		if(hmMatriculas.remove("0000FVG") == null)
		{
			System.out.println("No existe la matrícula.");
		}
		else
		{
			System.out.println("Eliminada.");
		}

		for(String matricula: hmMatriculas.keySet())
		{
			System.out.println(matricula + " Multas: "
					+ hmMatriculas.get(matricula));
		}

		System.out.println("Con iterador:");
		Iterator<String> iterator = hmMatriculas.keySet().iterator();
		String matricula;
		int multas;
		while(iterator.hasNext())
		{
			matricula = iterator.next();
			multas = hmMatriculas.get(matricula);
			System.out.println(matricula + " Multas: "
					+ multas);
		}
		hmMatriculas.size();
		hmMatriculas.clear();
	}
}
