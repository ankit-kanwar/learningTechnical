package ocja;

class Parent6{
	 int  x=888;
}

class Child6 extends Parent6{
	 int  x=999;
}
public class PolymorphismDynamicVariables {

	public static void main(String[] args) {
		Parent6 p = new Parent6();
		System.out.println(p.x);
		
		Child6 c = new Child6();
		System.out.println(c.x);
		
		Parent6 p1 = new Child6();
		System.out.println(p1.x);
	}

}
