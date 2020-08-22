package ocja;

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}
 
abstract class ALog {
    public static void log() { 
        System.out.println("Log");
    }
}
/*
 * public class InterfaceDefaultStaticMethod extends ALog implements ILog{
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */