package List_Collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(19);
		System.out.println("elements"+pq);
        pq.remove();
        System.out.println("elements"+pq);
        pq.remove();
        System.out.println("elements"+pq);
	}

}
