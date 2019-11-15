package com.sms.main;

import java.util.Scanner;

import com.sms.menus.StudentDetails;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------------------------------");
			System.out.println("|    STUDENT MANAGEMENT SYSTEM    |");
			System.out.println("-----------------------------------");
			System.out.println("|   1. ADMIN                      |");
			System.out.println("|   2. STUDENT                    |");
			System.out.println("|   3. EXIT                       |");
			System.out.println("-----------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				StudentDetails.adminMenu();
				break;
			case 2:
				StudentDetails.studentMenu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select choice range 1-3 only");
			}
		}


	}

}
