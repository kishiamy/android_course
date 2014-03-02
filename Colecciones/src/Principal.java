import java.util.Set;
import java.util.TreeSet;


public class Principal {

	public static void main(String[] main) {
		Set<String> conjunto = new TreeSet <String>();
		
		conjunto.add("manzana");
		conjunto.add("pera");
		conjunto.add("fresa");
		conjunto.add("naranja");
		conjunto.remove("pera");
		for(String s : conjunto) {
		     System.out.println(s);
		}
	}

}
