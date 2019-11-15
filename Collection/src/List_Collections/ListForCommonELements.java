package List_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
//assignment1:
public class ListForCommonELements {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("raji");
		l1.add("jagadish");
		l1.add("snigdha");
		l1.add("navya");
		l1.add("Santhosh");
		l1.add("ravi");
		l1.add("ravi");
		l1.add("snigdha");
		System.out.println("list elements"+l1);
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("priya");
		lhs.add("rahul");
		lhs.add("priya");
		System.out.println("elements in linkedhashset"+lhs);
		lhs.addAll(l1);
		System.out.println("after addall the  list is"+lhs);
	}

}
