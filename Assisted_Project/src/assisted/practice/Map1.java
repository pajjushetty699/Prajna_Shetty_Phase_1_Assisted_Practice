package assisted.practice;
import java.util.*;
public class Map1 {

	public static void main(String[] args) {
		//Hash Map
		HashMap<Integer,String> is=new HashMap<Integer,String>();
		is.put(1,"Dhruv");
		is.put(2,"Dhruvi");
		is.put(3,"Dhruvant");
		is.put(4,"Dharsh");
	      System.out.println("\n Hash Map elements are ");  
	      for(Map.Entry n:is.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	     //HashTable
	       
     Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Rocky");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Rony");  
	      ht.put(7,"Rini");
	      ht.put(8,"Rellu");

	      System.out.println("\n Hash Table Elements are");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Annu");    
	      map.put(9,"Amul");    
	      map.put(10,"Aadi");    
	      map.put(10, "Amru");
	      
	      System.out.println("\n Tree Map Elements are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  



	}


