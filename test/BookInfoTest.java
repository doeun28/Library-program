import org.junit.jupiter.api.Test;

public class BookInfoTest {

    @Test
    void testAddBookPrintTrueFalse() {
        BookInfo info = new BookInfo();

        boolean r1 = info.addBook("김철수", "파이썬입문", "808.8 김 64ㅇ");
        boolean r2 = info.addBook("","파이썬입문", "808.8 김 64ㅇ");
        boolean r3 = info.addBook(null,"파이썬입문", "808.8 김 64ㅇ");

        System.out.println("Test 1: " + r1);
        System.out.println("Test 2: " + r2);
        System.out.println("Test 3: " + r3);
    }
}

