import org.junit.jupiter.api.Test;

public class BookInfoTest {

    @Test
    void testAddBookPrintTrueFalse() {
        BookInfo info = new BookInfo();

        boolean r1 = info.addBook("홍길동", "책1", "ID001");
        boolean r2 = info.addBook("","책2", "ID002");
        boolean r3 = info.addBook(null,"책2", "ID002");

        System.out.println("Test 1: " + r1);
        System.out.println("Test 2: " + r2);
        System.out.println("Test 3: " + r3);
    }
}

