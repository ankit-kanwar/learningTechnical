package ocja;


class Book2 {
    private String name;
    private String author;
    
    Book2() {}
    
    Book2(String name, String author) {
        name = name;
        author = author;
    }
    
    String getName() {
        return name;
    }
    
    String getAuthor() {
        return author;
    }
}
 
public class LocalVariablePrivate {
	public static void main(String[] args) {
        //private 
        Book2 book = new Book2("Head First Java", "Kathy Sierra");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
