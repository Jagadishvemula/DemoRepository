package Sorting;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	public int sno;
	public String sname;
	public int smarks;
	public String ssub;
	public Student(int sno, String sname, int smarks, String ssub) {
		
		this.sno = sno;
		this.sname = sname;
		this.smarks = smarks;
		this.ssub = ssub;
		
	}
	public String toString(){
		return sno+"\t"+sname+"\t"+smarks+"\t"+ssub;
	}
}
class StudentNameSorting implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.sname.compareTo(s2.sname);
	}
	
}

public class CompararorDemo {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"jaggu",75,"java"));
		students.add(new Student(2,"ravi",60,"Sql"));
		students.add(new Student(3,"rahul",75,"java"));
		students.add(new Student(4,"heman",65,"c"));
		System.out.println("without sorting student details");
		for(Student s:students){
			System.out.println(s);
		}
		Collections.sort(students,new StudentNameSorting());
		System.out.println("after sorting");
		for(Student s:students){
			System.out.println(s);
		}
	}

}
