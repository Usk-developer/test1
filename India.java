import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class India {
	public static void main(String[] args) {
		ArrayList<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Mumbai");
		maharashtra.add("Pune");
		maharashtra.add("Nashik");
		
		ArrayList<String> karnataka = new ArrayList<String>();
		karnataka.add("Banglore");
		karnataka.add("Mysore");
		
		ArrayList<String> madhyaPradesh = new ArrayList<String>();
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Indore");
		
		HashMap<String, ArrayList<String>> states = new HashMap<String, ArrayList<String>>();
		states.put("Maharashtra", maharashtra);
		states.put("Karnataka", karnataka);
		states.put("MadhyaPradesh", madhyaPradesh);
		
		HashMap<String, HashMap<String, ArrayList<String>>> india = new HashMap<String, HashMap<String, ArrayList<String>>>();
		india.put("India", states);
		
		Set<String> set = india.keySet();
		for(String str:set){
		System.out.println(str);
		System.out.println(india.get(str));
		}
		
		
		
	}

}
