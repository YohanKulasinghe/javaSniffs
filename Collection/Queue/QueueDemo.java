import java.util.*;

public class QueueDemo {
	public static void main (String args[]){

		PriorityQueue queue = new PriorityQueue();


		for(int i = 0; i < 10; i++){
			queue.add(i);
		}

		System.out.println(queue.size());


		System.out.println(queue.peek());

		System.out.println(queue.poll());

		System.out.println(queue.peek());

		System.out.println(queue.size());
	}

}