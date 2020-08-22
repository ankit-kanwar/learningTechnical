package ocja;

abstract class Log {
    abstract long count(); //Line n1
    abstract Object get(); //Line n2
}
 
class CommunicationLog extends Log {
    long count() { //Line n3
        return 100;
    }
    
    String get() { //Line n4
        return "COM-LOG";
    }
}
public class OverrideCovarientReturnType {
	public static void main(String[] args) {
		Log log = new CommunicationLog(); //Line n5
		System.out.print(log.count());
        System.out.print(log.get());
        
	}
	

}
