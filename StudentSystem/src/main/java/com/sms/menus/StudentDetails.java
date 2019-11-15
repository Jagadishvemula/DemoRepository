package com.sms.menus;

import java.util.List;
import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.daoimpl.StudentDAOImpl;

public class StudentDetails {
	static Scanner sc = new Scanner(System.in);
	static StudentDAOImpl studentDAO = new StudentDAOImpl();
	public static void adminMenu() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------");
		System.out.println("|     ADMIN MAIN MENU      |");
		System.out.println("----------------------------");
		System.out.println("|  1. ADD STUDENT          |");
		System.out.println("|  2. VIEW STUDENT         |");
		System.out.println("|  3. VIEW ALL STUDENTS    |");
		System.out.println("|  4. UPDATE STUDENT       |");
		System.out.println("|  5. DELETE STUDENT       |");
		System.out.println("|  6. BACK                 |");
		System.out.println("----------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			studentDAO.addStudent();
			adminMenu();
			break;
		case 2:
			System.out.println("Enter Search Student Number ?");
			Student student = studentDAO.viewStudent(sc.nextInt());
			System.out.println("SNO" + "\t" + "SNAME" + "\t" + "MARKS");
			System.out.println("-----------------------------");
			System.out.println(student);
			adminMenu();
			break;
		case 3:
			List<Student> students = studentDAO.viewAllStudents();
			System.out.println("SNO" + "\t" + "SNAME" + "\t" + "MARKS");
			System.out.println("-----------------------------");
			for (Student s : students) {
				System.out.println(s);
			}
			adminMenu();
			break;
		case 4:
			System.out.println("Which Student do you want to Update ?");
			studentDAO.updateStudent(sc.nextInt());
			adminMenu();
			break;
		case 5:
			System.out.println("Which Student do you want to Delete ?");
			studentDAO.deleteStudent(sc.nextInt());
			adminMenu();
			break;
		case 6:
			studentDAO.back();
			break;
		default:
			System.out.println("Please select choice range 1-6 only");
		}

		
	}
	public static void studentMenu() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------");
		System.out.println("|    STUDENT MAIN MENU      |");
		System.out.println("-----------------------------");
		System.out.println("|  1.VIEW STUDENT           |");
		System.out.println("|  2.BACK                   |");
		System.out.println("-----------------------------");
		System.out.println("Enter Your choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Your Student Number ?");
			Student student = studentDAO.viewStudent(sc.nextInt());
			System.out.println("SNO" + "\t" + "SNAME" + "\t" + "MARKS");
			System.out.println("-----------------------------");
			System.out.println(student);
			studentMenu();
			break;
		case 2:
			studentDAO.back();
			break;
		default:System.out.println("Please select choice range 1-2 only");	
		}


		
	}


}
