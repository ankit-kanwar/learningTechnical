package ocja;

public class DecimalOctalHeaxa {

	public static void main(String[] args) {
		int iOct = 0123;
		int iHex = 0X123;
		System.out.println(iOct+":"+iHex);
		
		double d=0123.456;
		System.out.println("d:"+d);
		//double d=0x123.456;
		
		double dExp=1.2e-3;
		System.out.println("dExp"+dExp);
		
		int iBinary=0B0101;
		System.out.println(iBinary);
		
		char ch=0xFace;
		System.out.println("ch:"+ch);

	}

}
