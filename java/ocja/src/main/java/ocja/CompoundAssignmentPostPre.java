package ocja;

public class CompoundAssignmentPostPre {

	public static void main(String[] args) {
		var val = 9;
		System.out.println(val+=10 - -val-- - --val);
		

	}

}
