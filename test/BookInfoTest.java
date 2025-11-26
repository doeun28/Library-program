import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookInfoTest {

    @Test
    public void testAddBook() {
        BookInfo info = new BookInfo();

        boolean result = info.addBook("홍길동", "홍길동전", "12341234");
        assertTrue(result,"책 추가 완료");
    }

}

