package objectOverriding;

public class Car {
	String name;
	int number;
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + "]";
	}


	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "Car";
		c1.number = 1234;
		
		System.out.println(c1);
		System.out.println(c1.toString());
	}
}
