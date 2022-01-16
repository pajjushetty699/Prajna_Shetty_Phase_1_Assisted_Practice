package assisted.practice;

public class StringToPrimitiveData {
			public static void main(String[] args) {
		        String s="90";
		        //conveting string into integer
		        int n=Integer.parseInt(s);
		        System.out.println(n);
		        
		        String t="89.9";
		        //coverting string into float
		        float f=Float.parseFloat(t);
		        System.out.println(f);
		        
		        String r="87.989";
		        //converting string into double
		        double d=Double.parseDouble(r);
		        System.out.println(d);
		        
		        String b="87987898876";
		        //converting string into long
		        long l=Long.parseLong(b);
		        System.out.println(l);
		        
		        String g="prajna";
		        //converting string into char
		        for(int i=0;i<g.length();i++) {
		        	char a=g.charAt(i);
		        	System.out.println("char of prajna "+a);
		        }
			}

		}

