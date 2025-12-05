package arrayList;

import java.util.ArrayList;

public class Utilidades {

	public static ArrayList<String> alReves(ArrayList<String> cadenas) {
		
		ArrayList<String> alReves = null;
		
		if (cadenas != null) {
			
			alReves = new ArrayList<>();
			
			for (int i = cadenas.size()-1; i >= 0; i--) {
				alReves.add(cadenas.get(i));
			}
			
		}
		
		return alReves;
	}
	
}
