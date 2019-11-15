package com.sms.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;
import com.sms.db.DButil;
import com.sms.main.StudentManagementSystem;
import com.sms.query.Query;

public class StudentDAOImpl implements StudentDAO {
	PreparedStatement ps = null;
	Connection con = DButil.getConnection();;
	Student student = null;
	List<Student> students = null;
	Scanner sc = new Scanner(System.in);

	public void addStudent() {
		int i = 1;
		while (i == 1) {
			try {
				ps = con.prepareStatement(Query.insert_student);
				System.out.println("Enter Student Number ?");
				ps.setInt(1, sc.nextInt());
				System.out.println("Enter Student Name ?");
				ps.setString(2, sc.next());
				System.out.println("Enter Student Marks ?");
				ps.setInt(3, sc.nextInt());
				int n = ps.executeUpdate();
				if (n != 0) {
					System.out.println("One Record Inserted Successfully...");
				} else {
					System.out.println("Record Not Inserted. Please try again");
				}
				System.out.println("Do you want to add more record press 1 else any number");
				i = sc.nextInt();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					ps.close();
					//con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public Student viewStudent(int sno) {
		
		Student student = new Student();
		try {
			ps = con.prepareStatement(Query.view_student);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				student.setSno(rs.getInt(1));
				student.setSname(rs.getString(2));
				student.setMarks(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				//con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;

	}

	public List<Student> viewAllStudents() {
		students = new ArrayList<Student>();
		Student s = null;
		try {
			ps = con.prepareStatement(Query.view_all_student);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				s = new Student();
				s.setSno(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setMarks(rs.getInt(3));
				students.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				//con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return students;
	}

	public void updateStudent(int sno) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println("Select Your Choice : 1. Student Name  2.Student Marks ?");
		int choice = sc.nextInt();
		try {
			switch(choice)
			{
			case 1:ps=con.prepareStatement(Query.update_student_name);
			       System.out.println("Enter Updating Student Name ?");
			       ps.setString(1,sc.next());
			       ps.setInt(2,sno);
			       n=ps.executeUpdate();
			       if(n!=0)
			       {
			    	   System.out.println("Student Name Updated Successfully");
			       }else{
			    	   System.out.println("Stydebt Name Not Updated.Please try again");
			       }
			       break;
			case 2:ps=con.prepareStatement(Query.update_student_marks);
			       System.out.println("Enter Updating Student Marks >");
			       ps.setInt(1, sc.nextInt());
			       ps.setInt(2,sno);
			       n = ps.executeUpdate();
			       if(n!=0)
			       {
			    	   System.out.println("Student Marks Updated Successfully");
			       }else{
			    	   System.out.println("Student Marks Not Updated.Please try again");
			       }
			       break;
			 default:System.out.println("Please select choice range 1-2 only");      
			       
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public void deleteStudent(int sno) {
		// TODO Auto-generated method stub
		try {
			ps = con.prepareStatement(Query.delete_student);
			ps.setInt(1, sno);
			int n = ps.executeUpdate();
			if(n!=0)
			{
				System.out.println("Successfully Student Record Deleted");
			}else{
				System.out.println("Recored Notable to deleted.Please try again");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				//con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

	public void back() {
		// TODO Auto-generated method stub
		StudentManagementSystem.main(null);

		
	}

}
