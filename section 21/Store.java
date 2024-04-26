import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Book> books;
    // private List<Book> books = new ArrayList<>();

    public Store() {
        this.books = new ArrayList<>();
    }

    public void sellBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
            }
        }
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public Book getBook(int index) {
        return new Book(books.get(index));
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    public void setBook(int index, Book source) {
        this.books.set(index, new Book(source));
    }
}
