import java.util.*;

public class setDemo {

	public static void main (String args[]){
		HashSet hs = new HashSet();


		LinkedHashSet lhs = new LinkedHashSet();

		TreeSet ts = new TreeSet();

		ts.add("S");
		ts.add("S");
		ts.add("F");
		ts.add("S");
		ts.add("M");
		ts.add("J");
		ts.add("A");

		Iterator  itr = ts.iterator();

		System.out.print(ts);

	}
}