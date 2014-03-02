import java.util.ArrayList;
import java.util.List;
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
		
		List<Complejo> lista = new ArrayList<Complejo>(); 
		
		lista.add(new Complejo(1.0, 5.0));
		lista.add(new Complejo(2.0, 4.2));
		lista.add(1, new Complejo(3.0, 0.0) );lista.remove(0); 
		for(Complejo c: lista) {
		    System.out.println(c);
		}
	}
}
