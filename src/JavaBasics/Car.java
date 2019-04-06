package JavaBasics;

public class Car {
	int model;
	int wheel;

	
	
	
	
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		
		//object creation
		Car a = new Car();
		Car b = new Car();
		a.model = 2015;
		a.wheel = 4;
		b.model = 2014;
		b.wheel = 4;
		System.out.println(a.model+ " "+a.wheel);
		System.out.println(b.model+ " "+b.wheel);
		
		a=b;
		b=a;
		a.model = 10;
		System.out.println(a.model);
		b.model = 20;
		System.out.println(a.model);

	}

}
