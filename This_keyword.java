// Call the function using this keyword
class C {
    public void create() {
        System.out.print("C is created");
    }

    public void print() {
        this.create();
    }
}

// call the constructor using this keyword
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title) {
        this(title, "Unknown");
    }
}

public class This_keyword {
    public static void main(String[] args) {
        C c = new C();
        c.print();

        Book book1 = new Book("Pascal language");
        Book book2 = new Book("Mahabharat", "Ved Vyasa");

        System.out.println("\nBook1 Title: " + book1.title + ", Author: " + book1.author);
        System.out.println("Book2 Title: " + book2.title + ", Author: " + book2.author);
    }
}