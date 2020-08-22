package ocja;

class Test{
	public String toString() {
		return null;
	}
}
public class StringConcatenationNull {

	public static void main(String[] args) {
		String text = null;
		String text2 = null;
		//text = text + new Test();
		System.out.println(text);
		System.out.println(text+text2);

	}

}
