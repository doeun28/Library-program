public class Book {
    String author;
    String title;
    String bookId;

    public Book(String author, String title, String bookId) {
        this.author = author;
        this.title = title;
        this.bookId = bookId;
    }
    @Override
    public String toString() {
        return "[저자: " + author + ", 제목: " + title + ", 청구기호: " + bookId + "]";
    }
}
