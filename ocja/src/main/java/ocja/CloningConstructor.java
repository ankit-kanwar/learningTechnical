package ocja;

public class CloningConstructor implements Cloneable{
	
	String name;
	int rollNo;
	CloningConstructor(String name,int rollNo){
		System.out.println("constructor execution\n");
		this.name=name;
		this.rollNo=rollNo;
	}

	public static void main(String[] args) throws CloneNotSupportedException{
		CloningConstructor s1 = new CloningConstructor("Ankit",101);
		CloningConstructor s2 = (CloningConstructor) s1.clone();
		System.out.println(s2.name+":"+s2.rollNo);
	}
}
