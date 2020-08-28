package ocja;

class Covarient2 {

	public Object m1(){
		return 1;
	}

}

class CovarientChild extends Covarient2{
	public String m1() {
		return null;
	}
}
