package ocja;

class Base {
    String msg = "INHALE"; //Line n1
}
 
class Derived extends Base {
    Object msg = "EXHALE"; //Line n2
}
 

public class VarStringConcat {
	public static void main(String[] args) {
        Base obj1 = new Base(); //Line n3
        Base obj2 = new Derived(); //Line n4
        Derived obj3 = (Derived) obj2; //Line n5
        var var = obj1.msg + "-" + obj2.msg + "-" + obj3.msg; //Line n6
        System.out.println(var); //Line n7
        System.out.println(var.getClass());
    }

}
