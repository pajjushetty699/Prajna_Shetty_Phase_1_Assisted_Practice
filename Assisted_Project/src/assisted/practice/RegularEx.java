package assisted.practice;
import java.util.regex.*;
import java.util.regex.Matcher;
public class RegularEx {

	public static void main(String[] args) {
	     String s="[a-zA-Z0-9]+";
	     String check="HelloWorld123";
	     Pattern p = Pattern.compile(s);
	 	Matcher c = p.matcher(check);
	 	
	 	while (c.find())
	       	System.out.println( check.substring( c.start(), c.end() ) );


	}

}
