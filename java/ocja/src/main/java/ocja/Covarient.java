package ocja;

interface I1{
	public Object m1();
}

interface I2{
	public String m1();
}

class C1 implements I1,I2{
	public String m1() {
		return null;
	}
}
