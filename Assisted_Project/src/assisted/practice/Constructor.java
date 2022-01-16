package assisted.practice;

public class Constructor {
	int id;
	String Name;
	int age;
	//default constructor
	Constructor(){
		System.out.println("construct");
		
	}
	//Parametrized construct
	 Constructor(int i, String n, int a){  
		    id = i;  
		    Name = n;  
		    age=a;  
		    } 
	 void display(){
		 System.out.println("Student details");
		 System.out.println("ID "+id+" Name "+Name+" Age "+age);
	 }

	public static void main(String[] args) {
		Constructor c1=new Constructor(20,"prajna",22);
		c1.display();
	}

}
