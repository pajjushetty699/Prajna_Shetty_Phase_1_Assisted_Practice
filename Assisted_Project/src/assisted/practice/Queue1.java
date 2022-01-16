package assisted.practice;
import java.util.*;
public class Queue1 {

	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Maharastra");
		        		locationsQueue.add("Dharwad");
		        		locationsQueue.add("Pune");
		        		locationsQueue.add("Gujarat");
		        		locationsQueue.add("Udupi");
		System.out.println("Queue is : " + locationsQueue);
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		locationsQueue.remove();
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		System.out.println("Size of Queue : " + locationsQueue.size());
		    	}
		


	}


