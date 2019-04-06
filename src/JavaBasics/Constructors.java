package JavaBasics;

public class Constructors {
	String name;
	int age;
	
	public Constructors() {
		System.out.println("Default Constructor");
	}
    public Constructors(int i) {
    	System.out.println("Constructor with one parameter");
    	System.out.println(i);
    }
	public Constructors (int i, int j) {
		System.out.println(" Const with 2 parameters ");
		System.out.println(i+ " "+j);
		
	}
	
	public Constructors (String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name);
	}
	
	
	
	public static void main(String[] args) {
		Constructors obj = new Constructors();
		Constructors obj1 = new Constructors(10);
		Constructors obj2 = new Constructors(10,20);
		Constructors obj3 = new Constructors("Tom",20);
		System.out.println(obj3.name+ " "+obj3.age);
	}

}
