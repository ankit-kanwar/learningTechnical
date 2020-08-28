package ocja;

interface Interface3 {
	int x=10;
}

class Implementer implements Interface3{
	public static void main(String[] args) {
		//x=999;
		System.out.println(x);
	}
}