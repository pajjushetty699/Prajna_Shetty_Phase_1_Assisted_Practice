package assisted.practice;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		                        //Array List
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Mangalore");//
	      city.add("Udupi");    	   
	      System.out.println(city);  
		
		                       //creating Vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(40); 
	      vec.addElement(50); 
	      System.out.println(vec);
		
		                    //creating LinkedList
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  }
	       
	                               //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(201);  
	       set.add(203);  
	       set.add(202);
	       set.add(204);
	       System.out.println(set);
	       
	                              //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(21);  
	       set2.add(23);  
	       set2.add(22);
	       set2.add(24);	       
	       System.out.println(set2);
	      	} 
	      }  


		
	


