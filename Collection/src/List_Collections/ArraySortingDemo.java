package List_Collections;

import java.util.Arrays;

public class ArraySortingDemo {

	public static void main(String[] args) {
		Integer[] i1= new Integer[5];
		i1[0]=2;
		i1[1]=3;
		i1[2]=20;
		i1[3]=15;
		i1[4]=12;
		System.out.println("elements are");
		for(int i:i1){
			System.out.println(i);
			
		}
	Arrays.sort(i1);
	System.out.println("after sorting array elements");
	for(int i:i1){
		System.out.println(i);
	}
			}

}
