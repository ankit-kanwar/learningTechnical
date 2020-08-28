package ocja;

public class ComplexExpression {

	public static void main(String[] args) {
		int m = 20;
        int var = --m * m++ + m-- - --m;
        System.out.println("m = " + m);
        System.out.println("var = " + var);

	}

}
