package ocja.udemy;

interface Buyable{
	int salePercentage=85;
	 
	public static String salePercentage() {
		return salePercentage+"%";
	}
}

class Book implements Buyable{
	//@Override
	public static String salePercentage() {
		return salePercentage+"#";
	}
}

public class InterfaceStaticMethodsAndVariables {

	public static void main(String[] args) {
		Buyable[] arr = new Buyable[2];
		for (Buyable buyable : arr) {
			System.out.println(Buyable.salePercentage());
			System.out.println(buyable.salePercentage);
		}
		
		Book[] books = new Book[2];
		for (Book book : books) {
			System.out.println(book.salePercentage);
			System.out.println(book.salePercentage());
		}

	}

}
