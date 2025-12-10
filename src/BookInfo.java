import java.io.*;
import java.util.*;

public class BookInfo {

    private static final String FILE_NAME = "library.csv";

    private List<Book> books = new ArrayList<>();

    public boolean addBook(String author, String title, String bookId) {

        if (author == null || author.isEmpty() ||
                title == null || title.isEmpty() ||
                bookId == null || bookId.isEmpty()) {
            System.out.println("책 정보가 올바르지 않습니다. 다시 입력하세요.");
            return false;
        }

        Book newBook = saveBook(author, title, bookId);
        if (newBook != null) {
            books.add(newBook);
            saveToCsv(newBook);
            return true;
        }

        return false;
    }
    // 책을 csv로 저장
    public static void saveToCsv(Book book) {
        boolean fileExists = new File(FILE_NAME).exists();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            if (!fileExists) {
                bw.write("author,title,bookId");
                bw.newLine();
            }

            bw.write(book.getAuthor() + "," + book.getTitle() + "," + book.getBookId());
            bw.newLine();

            System.out.println("파일 저장 완료: " + FILE_NAME);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Book saveBook(String author, String title, String bookId) {
        return new Book(author, title, bookId);
    }

    public List<Book> getBookList() {
        return new ArrayList<>(books);
    }
}
