package List_Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int element=0,pos=0;
		Stack st = new Stack();
		while(true){
		System.out.println("-----------          ----------");
		System.out.println("|     STACK OPERATIONS        |");
		System.out.println("--------------------------------");
		System.out.println("|    1.PUSH AN ELEMENT        |");
		System.out.println("|    2.POP AN ELEMENT         |");
		System.out.println("|    3.SEARCH FOR AN ELEMENT  |");
		System.out.println("|    4.GET THE ELEMENT        |");
		System.out.println("|    5.EXIT                   |");
		System.out.println("--------------------------------");
		System.out.println("ENTER YOUR CHOICE");
		int choice= sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("enter an element");
			element = sc.nextInt();
			st.push(element);
			System.out.println("stack elements are"+st);
			break;
		case 2:
			st.pop();
			System.out.println("stack elements are"+st);
			break;
		case 3:
			System.out.println("enter search element");
			element= sc.nextInt();
			pos=st.search(element);
			System.out.println("element is at"+pos);
			break;
		case 4:
			System.out.println(st.peek());
			System.out.println("stack elements are"+st);
			break;
		case 5:System.exit(0);
		break;
		default:
			System.out.println("please select 1-5 only");
		}
		}

	}

}
