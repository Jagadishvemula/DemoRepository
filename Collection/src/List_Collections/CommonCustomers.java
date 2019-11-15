package List_Collections;
//Assignment2
import java.util.ArrayList;
import java.util.LinkedList;

public class CommonCustomers {

	public static void main(String[] args) {
		ArrayList<String> ll= new ArrayList<String>();
		
		ll.add("jagu");
		ll.add("santhos");
		ll.add("ravi");
		ll.add("rahul");
		System.out.println("hp gas consumer list"+ll);
		ArrayList<String> l2= new ArrayList<String>();
		l2.add("santhos");
		l2.add("ravi");
		l2.add("snigdha");
		System.out.println("indian gas list"+l2);
		ll.retainAll(l2);
		System.out.println(ll);
		

	}

}
