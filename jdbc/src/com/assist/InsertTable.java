package com.assist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertTable {
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
		      System.out.println("Inserting record into the table");
		      stmt = conn.createStatement();
		      
		      String sql =  "insert into student values(2,'paaru','eee',22)";
		      stmt.executeUpdate(sql);
		      sql =  "insert into student values(3,'pavi','ise',21)";
		      stmt.executeUpdate(sql);
		      sql =  "insert into student values(4,'vinay','me',20)";
		      stmt.executeUpdate(sql);
		       sql =  "insert into student values(5,'vijay','cse',19)";
		      stmt.executeUpdate(sql);
		       sql =  "insert into student values(6,'aaunsh','ise',18)";
		      stmt.executeUpdate(sql);
		      System.out.println("Record inserted Successfully ...");
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
