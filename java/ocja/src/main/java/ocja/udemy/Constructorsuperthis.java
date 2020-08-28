package ocja.udemy;


class Document{
	int pages;
	Document(int pages){
		this.pages=pages;
	}
}

class Word extends Document{

	String type;
	Word(String type){
		super(20);
		this.type=type;
	}
	
	Word(int pages,String type){
		this(type);
		super.pages=pages;
	}
	
}
public class Constructorsuperthis {

	public static void main(String[] args) {
	}

}
