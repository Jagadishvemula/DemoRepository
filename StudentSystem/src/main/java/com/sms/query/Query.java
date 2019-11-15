package com.sms.query;

public interface Query {
	public String insert_student = "insert into student values(?,?,?)";
	public String view_student = "select * from student where sno=sno";
	public String view_all_student = "select * from student";
	public String update_student_name ="update student set sname=? where sno=?";
	public String update_student_marks = "update student set marks=? where sno=?";
	public String delete_student = "delete from student where sno=?";

}
