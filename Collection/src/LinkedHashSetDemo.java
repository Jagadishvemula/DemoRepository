import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Integer(65));
		lhs.add(12);
		lhs.add(new Integer(12));
        lhs.add("sudaksha");
        lhs.add('c');
        lhs.add(16);
        lhs.add(null);
        lhs.add("raji");
        System.out.println("linkedlist array"+lhs);
        LinkedHashSet lhs1 = new LinkedHashSet();
        lhs1.add(200);
        lhs1.add("abc");
        lhs.addAll(lhs1);
        System.out.println("after adding"+lhs);
        lhs.add(12);
        System.out.println("linkedlist array"+lhs);
       
       
	}

}
