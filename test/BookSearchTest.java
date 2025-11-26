import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {
    BookInfo manager = new BookInfo();

    @BeforeEach
    void setUp() {
//        리스트 세팅
        manager.addBook("author", "title", "bookId");
        manager.addBook("author", "title2", "bookId2");
        manager.addBook("author", "title3", "bookId3");

    }

//    도서 검색 기능을 위한 단위테스트 개발 완료
//    이슈 : https://github.com/doeun28/Library-program/issues/7#issue-3668738597
    @Test
    void searchBook() {
//        객체 생성
        BookSearch search = new BookSearch(manager);


//        검색 결과: 단일 항목일 경우
//        통과
        List<Book> foundBook = search.searchBook("title");
        assertEquals(manager.getBookList().get(0), foundBook.getFirst());


//        검색 결과: 다중 항목일 경우
//        통과
        List<Book> foundBook2 = search.searchBook("author");
        assertEquals(manager.getBookList(), foundBook2);


//        검색 결과: 항목에 없는 경우
//        통과
        List<Book> foundBook3 = search.searchBook("null");
        assertNull(foundBook3);

    }
}