package ocja.dumps;

interface Readable {
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable{
	public void readBook() {
		
	}
}

abstract class EBook extends Book{
	public void readBook() {		
	}
	
}

abstract class Toy{
	public abstract int calculatePrice(Toy t);
	public final void printToy(Toy t) {
		
	}
}
