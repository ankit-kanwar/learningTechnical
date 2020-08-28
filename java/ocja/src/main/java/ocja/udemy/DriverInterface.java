package ocja.udemy;

interface Perishable1{
	default int maxDays() {
		return 1;
	}
}

interface Perishable2 extends Perishable1{
	default int maxDays() {
		return 2;
	}
}
public class DriverInterface implements Perishable1,Perishable2{

	public static void main(String[] args) {
		Perishable1 p = new DriverInterface();
		System.out.println(p.maxDays());
		
		Perishable2 p2 = new DriverInterface();
		System.out.println(p2.maxDays());
		
		DriverInterface d = new DriverInterface();
		System.out.println(d.maxDays());

	}

}
