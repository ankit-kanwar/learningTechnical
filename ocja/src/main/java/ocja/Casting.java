package ocja;


class Ma {
    public void printName() {
        System.out.println("M");
    }
}



class Na extends Ma {
    public void printName() {
        System.out.println("N");
    }
}



public class Casting {
	public static void main(String[] args) {
        Ma obj1 = new Ma();
        Na obj2 = (Na)obj1;
        obj2.printName();
    }
}
