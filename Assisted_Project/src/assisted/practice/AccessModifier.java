package assisted.practice;

public class AccessModifier {
	public void display(){
		System.out.println("Usnig public access modifier");
	}
	void display2(){
		System.out.println("Using default access modifier");
		
	}
	private void display3(){
		System.out.println("Using private access modifier");
	}
	protected void display4(){
		System.out.println("Using protected access modifier");
	}

	public static void main(String[] args) {
		AccessModifier ob=new AccessModifier();
		ob.display();
		ob.display2();
		ob.display3();
		ob.display4();

	}

}
