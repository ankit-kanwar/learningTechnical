package ocja;

import java.util.ArrayList;
import java.util.List;

public class VarStatic {
	
	static String var = "Friends";
	public static void main(String [] args) {
		int var = (var = VarStatic.var.length());
		System.out.println(var);
		
	}

}
