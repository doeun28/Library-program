public class Book {
    private String author;
    private String title;
    private String bookId;
    private String publisher;

    public Book(String author, String title, String bookId, String publisher) {
        this.author = author;
        this.title = title;
        this.bookId = bookId;
        this.publisher = publisher;
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
    public String getpublisher() {
        return publisher;
    }


    @Override
    public String toString() {
        return "[" + "저자: " + author + ", 제목: " + title + ", 청구기호: " + bookId + ", 출판사: " + "]";
    }
}
