package ocja;

class Base2 {
    int id = 1000; //Line n1
 
    Base2() {
        Base2(); //Line n2
    }
 
    void Base2() { //Line n3
    	System.out.println("in Base2 method");
        System.out.println(++id); //Line n4
    }
}
 
class Derived2 extends Base2 {
    int id = 2000; //Line n5
 
    Derived2() {} //Line n6
 
    void Base2() { //Line n7
    	System.out.println("in Derived2 class Base2 method");
        System.out.println(--id); //Line n8
    }
}

public class InheritanceConstructor {
	 public static void main(String[] args) {
	        Base2 base = new Derived2(); //Line n9
	    }
}
