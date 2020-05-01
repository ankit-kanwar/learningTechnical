package ocja;


abstract class Vehicle{
	public abstract int getNumOfWheels();
}

class Bus extends Vehicle{

	@Override
	public int getNumOfWheels() {
		return 6;
	}
	
}

class Auto extends Vehicle{

	@Override
	public int getNumOfWheels() {
		return 3;
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		Vehicle v1 = new Bus();
		Vehicle v2 = new Auto();
		System.out.println(v1.getNumOfWheels());
		System.out.println(v2.getNumOfWheels());
	}

}
