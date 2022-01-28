package com.assist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Delete {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/project";
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
			   Class.forName("com.mysql.jdbc.Driver");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Delete record into the table");
		      stmt = conn.createStatement();
		      
		     // String sql =  "select name from student where student_id=3";
		       String sql="delete from student where student_id=3";
		      stmt.executeUpdate(sql);
		      System.out.println("Record deleted Successfully ...");
		   }catch(SQLException se){
		    
		      se.printStackTrace();
		   }catch(Exception e){
		     
		      e.printStackTrace();
		   }finally{
		     
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		}
}


