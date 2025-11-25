public class Book {
    private String author;
    private String title;
    private String bookId;

    public Book(String author, String title, String bookId) {
        this.author = author;
        this.title = title;
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "저자: " + author + ", 제목: " + title + ", 청구기호: " + bookId;
    }
}
