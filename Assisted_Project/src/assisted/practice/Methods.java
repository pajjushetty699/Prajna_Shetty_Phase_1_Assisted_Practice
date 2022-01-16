package assisted.practice;

public class Methods {
	public int divisionofnum(int x,int y){
		int z=x/y;
		System.out.println("result of division operation: "+z);
		return z;
		}
	public void Method(int c, int h){
		System.out.println("area of rectangle "+(c*h));
		
	}
	public void Method(int r){
		System.out.println("area of circle "+(3.14*r*r));
	}
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}
public static void main(String[] args) {
		Methods m=new Methods();
		int ans=m.divisionofnum(80, 10);
		m.Method(7, 8);
		System.out.println("Before operation value of data is "+m.val);
		m.operation(100);
		System.out.println("After operation value of data is "+m.val);

	}

}
