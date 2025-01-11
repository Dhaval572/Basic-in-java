
class Book {

    String title;
    String author;
    float price;

    // Public constructure
    public Book(String title, String author, float price) 
	{
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookInfo() 
	{
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Practice_1 {

    public static void main(String[] args) {
		Book book = new Book("C++", "Balagurusamy", 4534.454f);
		book.displayBookInfo();
    }
}
