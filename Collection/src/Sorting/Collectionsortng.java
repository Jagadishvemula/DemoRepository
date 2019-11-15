package Sorting;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>{
	public int eid;
	public String ename;
	public double salary;
	public Emp(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public String toString(){
		return eid+"\t"+ename+"\t"+salary;
	}
	@Override
	public int compareTo(Emp e) {
		// TODO Auto-generated method stub
		return ename.compareTo(e.ename);
	}
	
}
public class Collectionsortng {

	public static void main(String[] args) {
		ArrayList<Emp> employees = new ArrayList<Emp>();
		employees.add(new Emp(100,"abc",5000));
		employees.add(new Emp(300,"cbc",7000));
		employees.add(new Emp(200,"xbc",5500));
		employees.add(new Emp(105,"pbc",6000));
		System.out.println("without sorting employee list");
		for(Emp e:employees){
			System.out.println(e);
		}
		Collections.sort(employees);
		System.out.println("after sorting");
		for(Emp e:employees){
			System.out.println(e);
		}

	}

}
