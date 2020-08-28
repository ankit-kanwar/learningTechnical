package ocja;

public class StringBuilder4 {
	public static void main(String[] args) {
		var s = new StringBuffer();
		System.out.println(s.capacity());
		
		s.append("abcdefghijklmnop");
		
		System.out.println(s.capacity());
		
		s.append("q");
		
		System.out.println(s.capacity());
		
		s.append("abcdefghijklmnop");
		
		s.append("q");
		
		System.out.println(s.capacity());
		
		s.append("q");
		
		System.out.println(s.capacity());
		
		System.out.println(s.length());
		s.delete(0, 30);
		
		System.out.println(s.capacity());
		System.out.println(s.length());
	}
}
