package assisted.practice;

class Vechicle{
		void speed(){
			System.out.println("Vechicle speed");
		}
		class Bike{
			void show(){
			String color="Black";
					
			Vechicle.this.speed();
			System.out.println("Color of the Bike "+color);
			
		}
		
		}
	}
	public class InnerClass {
		void display(){
			class Car{
				void show(){
					System.out.println("The speed of the car is high");
				}
			}
			Car c=new Car();
			c.show();
		}

	public static void main(String[] args) {

		InnerClass ic=new InnerClass();
		Vechicle v= new Vechicle();
	 Vechicle.Bike b= v.new Bike();
        
        b.show();
        ic.display();
	}

}
