package ocja.udemy;

class Counter{
	int count=0;
}

interface SetCounter{
	void set(Counter ctr);
}
public class Driver5 {
	
	public static void main(String[] args) {
		Counter ctr = new Counter();
		SetCounter obj = x-> x.count=10;
		
	}

}
