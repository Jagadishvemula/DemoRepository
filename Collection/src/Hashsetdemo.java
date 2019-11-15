import java.util.Enumeration;
import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(15);
		hs.add(12);
		hs.add(34);
		hs.add(34);
		hs.add(null);
		hs.add("string");
		System.out.println("elements"+hs);
		hs.remove(10);
		System.out.println("elements"+hs);
		

		
		
		

	}

}
