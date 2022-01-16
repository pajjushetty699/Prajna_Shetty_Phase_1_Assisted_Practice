package assisted.practice;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File2 {

	public static void main(String[] args) {
		char[] array = new char[60];
	    String data="I am going to write tha data to the file";
	    String s="hello";
	    try {
	      //Creates a reader using the FileReader
	      FileReader input = new FileReader("C://Users//theju shetty//Desktop//simplylearn//file.txt");
	    
	      //  Reads characters
	      input.read(array);
	      
	      System.out.println("Data in the file:");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }catch(Exception e) {
	        e.getStackTrace();
	    }
	    	
	    try{
	    
	    FileWriter output = new FileWriter("C://Users//theju shetty//Desktop//simplylearn//file.txt");

	    output.write(data);
	      System.out.println("Data is written to the file.");

	      //  Closes the writer
	      output.close();
	    } catch(Exception e) {
	      e.getStackTrace();
	   
	    }
	}
	}
