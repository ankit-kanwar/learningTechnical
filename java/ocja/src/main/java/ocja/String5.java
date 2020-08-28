package ocja;

import org.w3c.dom.Text;

public class String5 {

	public static void main(java.lang.String[] args) {
		String str=null;
		//System.out.println(str.repeat(3));
		//System.out.println(null+"null"+null);
		//System.out.println(str+str+str);
		str+=null;
		System.out.println(str.concat(null));
		
	}
}
