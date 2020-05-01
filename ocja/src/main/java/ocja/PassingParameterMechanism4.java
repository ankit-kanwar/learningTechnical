package ocja;


class Book{
	int pages;
	double cost;
	Book(int pages,double cost){
		this.pages=pages;
		this.cost=cost;
	}
}
public class PassingParameterMechanism4 {
	
	public void updateBook(Book b,double newCost) {
		b.pages=400;
		b.cost=b.cost+newCost;
	}

	public static void main(String[] args) {
		var b =  new Book(262,100.0);
		var t =  new  PassingParameterMechanism4();
		double newCost = 200.0;
		t.updateBook(b, newCost);
		t.updateBook(b, newCost);
		System.out.println(b.pages+":"+newCost);
	}

}
