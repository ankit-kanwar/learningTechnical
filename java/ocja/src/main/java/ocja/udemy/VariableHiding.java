package ocja.udemy;

class Shape{
	int side =0;
	int getSide() {
		return side;
	}
}

class Square extends Shape{
	private int side =4;
	protected int getSide() {
		return side;
	}
}
public class VariableHiding {

	public static void main(String[] args) {
		Shape s = new Square();
		System.out.println(s.side+":"+s.getSide());

	}

}
