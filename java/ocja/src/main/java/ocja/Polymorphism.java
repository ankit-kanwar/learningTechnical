package ocja;

class Animal{
	
	
}

class Monkey extends Animal{
	
}
public class Polymorphism {
	
	public void m1(Animal a) {
		System.out.println("animal arg");
	}
	
	public void m1(Monkey m) {
		System.out.println("monkey arg");
	}
	public static void main(String[] args) {
		var p = new Polymorphism();
		Animal  a =new Monkey();
		p.m1(a);

	}

}
