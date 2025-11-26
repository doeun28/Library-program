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
//    도서 검색 기능 개발 완료
//    이슈 : https://github.com/doeun28/Library-program/issues/3
    public List<Book> searchBook(String keyword) {

//        입력된 키워드 변수에 저장
        this.keyword = keyword;

//        새 리스트 생성 리턴용
        List<Book> searchResults = new ArrayList<>();

//        반복문으로 bookList에서 순차적으로 리스트 가져오기
        for (Book book : bookList) {

//            속성별로 분리
            String author = book.getAuthor();
            String title = book.getTitle();
            String bookId = book.getBookId();

//            리스트와 키워드 비교
            if (author.contains(keyword) || title.contains(keyword) || bookId.contains(keyword)) {
                searchResults.add(book);
            }
        }
//        검색 결과 일치 항목이 없으면 null 반환
        if (searchResults.isEmpty()) {
            return null;
        }
        return searchResults;
    }
}
