import java.util.ArrayList;

public class BookInfo {

    private ArrayList<Book> books = new ArrayList<>();

    // Client가 호출하는 메서드
    public boolean addBook(String author, String title, String bookId) {
        if (author == null || author.isEmpty() ||
                title == null || title.isEmpty() ||
                bookId == null || bookId.isEmpty()) {
            System.out.println("책 정보가 올바르지 않습니다. 다시 입력하새요.");
            return false;
        }
        Book newBook = saveBook(author, title, bookId);
        if (newBook != null) {
            books.add(newBook);
            return true;
        }
        return false;
    }

    // Book 객체 생성 기능
    private Book saveBook(String author, String title, String bookId) {
        return new Book(author, title, bookId);
    }

    // 전체 책 출력 (검색이 없으므로 참고용)
    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

