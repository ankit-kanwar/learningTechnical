package ocja;

public class DataTypesAndLiterals {

	public static void main(String[] args) {
		float x = 130.9f;
		int y = 0x10;
		int z = 010;
		//int z = 090;
		int b = 0xbeef;
		//int a = 0xbeer;
		System.out.println("octal:"+z);
		System.out.println("hexa:"+y);
		System.out.println("hexa eg 2 beef:"+b);
		
		
		long d = 0777;
		//int e = 0777L;
		
		//byte e = 100b;  //wrong within range of byte compiler treats as byte
		//short e = 100s;  //wrong within range of short compiler treats as short 
		
		double f = 0123.456;
		//double f = 0x123.456;
		System.out.println("double with octal literal:"+f);
		
		
		double g = 1.2e3;
		System.out.println(g);
		
		float h = 1.2e3F;
		System.out.println(h);
		
		char i = 65435;
		System.out.println("character ch:"+i);
		
		int j = 0B111;
		System.out.println("integral value in binary form:"+j);
		
		
		char k = 0xface;
		System.out.println("char with hexa:"+k);
		
		byte l = (byte)130;
		System.out.println(l);
	}
}
