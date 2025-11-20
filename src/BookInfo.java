import java.util.ArrayList;
import java.util.List;

public class BookInfo {
    private List<Book> bookList;

    public BookInfo() {
        this.bookList = new ArrayList<>();
    }
    public boolean addBook(String author, String title, String bookId) {
        return saveBook(author, title, bookId);
    }
    private boolean saveBook(String author, String title, String bookId) {
        Book book = new Book(author, title, bookId);
        return bookList.add(book);
    }

}
