package com.sms.bean;

public class Student {
	private int sno;
	private String sname;
	private int marks;
	 public Student(){}
	public Student(int sno, String sname, int marks) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.marks = marks;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	 public String toString(){
		 return sno+"\t"+sname+"\t"+marks;
	 }
}
