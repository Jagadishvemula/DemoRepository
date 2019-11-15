import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(23);
		ts.add(new Integer(20));
		//ts.add("abc");
		ts.add(12);
		ts.add(15);
		System.out.println("elements"+ts);
		ts.remove(12);
		System.out.println(ts);
		ts.removeAll(ts);
		System.out.println(ts);
	//	ts.add(null);
		System.out.println(ts);


	}

}
