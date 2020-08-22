package ocja;

public class StringBuilderDelete {

	 static public  void main(String [] args) {
		StringBuilder sb = new StringBuilder("Friends are treasures");
        sb.delete(0, 30);
        System.out.println(sb.length());
        
        System.out.println("Equals??? " + (10 != 5) );

	}
}
