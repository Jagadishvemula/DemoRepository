package List_Collections;

import java.util.Scanner;

public class VectorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			if(n%i==0){
				System.out.println("number is prime");
			}else{
				System.out.println("number is not prime");
			}
			
		}
		

	}

}
