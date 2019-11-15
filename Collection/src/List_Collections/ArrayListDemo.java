package List_Collections;


import java.util.LinkedList;
import java.util.ListIterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add("abc");
		ll.add(null);
		ll.add(new Integer(20));
		System.out.println("elements"+ll);
		ll.addFirst(20);
		ll.add(10);
		ll.addLast(30);
		System.out.println("elements"+ll);
		ListIterator li=ll.listIterator();
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		
	}

}
