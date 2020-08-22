package ocja;


interface Leveller {
    int level();
}
 
public class LambdaThis {
	int i = 100; //Line n1
	 
    Leveller level = () -> {
        int i = 200; //Line n2
        return this.i; //Line n3
    };
 
    public static void main(String[] args) {
        System.out.println(new LambdaThis().level.level()); //Line n4
    }
}
