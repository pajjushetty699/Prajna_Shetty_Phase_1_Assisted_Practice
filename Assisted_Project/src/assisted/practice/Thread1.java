package assisted.practice;
public class Thread1 extends Thread
		{
		 	public void run()
		 	{
		  		System.out.println(" thread started running..");
		}
		 	public static void main( String args[] )
		 	{
		  		Thread1 mt = new  Thread1();
		  		mt.start();
		 	}
		}


	


