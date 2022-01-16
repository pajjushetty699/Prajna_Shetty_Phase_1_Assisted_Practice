package assisted.practice;

public class StringToBB {

	public static void main(String[] args) {
		String s="Welcome to ";
		//String to StringBuffer
		StringBuffer sb=new StringBuffer(s);
				System.out.println("String to StringBuffer");
		StringBuffer sb1=new StringBuffer(s);
		sb1.append("Simplilearn");
		System.out.println(sb1);
		//String to StringBuilder
        StringBuilder sbl = new StringBuilder(s); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              


	}

}
