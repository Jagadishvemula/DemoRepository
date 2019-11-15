import java.util.Date;

public class DateDiffernece {

	public static void main(String[] args) {
		Date d1= new Date(2019,10,29);
		Date d2= new Date(2019,10,12);
		long t1= d1.getTime();
		long t2=d2.getTime();
		System.out.println(t1);
		System.out.println(t2);
		long t = t1-t2;
		System.out.println(t/(24*60*60*1000));
		System.out.println(t/(60*60*1000));
		System.out.println(t/(60*60));
		System.out.println(t/(60));
		
		
		

	}

}
