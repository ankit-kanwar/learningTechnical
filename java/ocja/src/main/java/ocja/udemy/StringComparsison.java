package ocja.udemy;

public class StringComparsison {

	public static void main(String[] args) {
		boolean flag1 = "JAVA" == "JAVA".replace('J', 'J');
		boolean flag2 = "JAVA" == "JAVA".replace("J", "J");
		System.out.println(flag1+":"+flag2);

	}

}
