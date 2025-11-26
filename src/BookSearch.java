import java.util.ArrayList;
import java.util.List;

public class BookSearch {
//    멤버변수 선언
    private List<Book> bookList;
    String keyword;

//    리스트 가져오기
    public BookSearch(BookInfo info) {
        this.bookList = info.getBookList();
    }
//   가져온 리스트로 검색
    public List<Book> searchBook(String keyword) {
//        입력된 키워드 변수에 저장
        this.keyword = keyword;
//        새 리스트 생성 리턴용
        List<Book> searchResults = new ArrayList<>();
//        반복문으로 리스트와 키워드 비교
        for (Book book : bookList) {
//            이부분은 다시 논의

                searchResults.add(book);
        }

        return searchResults;
    }
}
