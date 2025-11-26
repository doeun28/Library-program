import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookInfo manager = new BookInfo();
        while (true) {
            System.out.println("\n==================================");
            System.out.println("[ 도서 관리 프로그램 v 1.0]");
            System.out.println("==================================");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 검색");
            System.out.println("3. 종료");
            System.out.println("==================================");
            System.out.print("-> 메뉴를 선택하세요 : ");
            String menu = sc.nextLine();
            if (menu.equals("0")) {
                System.out.println("-> 프로그램을 종료합니다.");
                break;
            }
            else if (menu.equals("1")) {
                System.out.println("\n[ 신규 도서 추가 ]");
                System.out.println("---------------------------------------------");

                System.out.print("1. 저자 입력 : ");
                String author = sc.nextLine();

                System.out.print("2. 제목 입력 : ");
                String title = sc.nextLine();

                System.out.print("3. 청구기호 입력 : ");
                String bookId = sc.nextLine();
                System.out.println("---------------------------------------------");

                boolean result = manager.addBook(author, title, bookId);

                if (result) {
                    System.out.println("-> 도서가 정상적으로 등록되었습니다!");
                    System.out.println("   (제목: " + title + ", 저자: " + author + ")");
                }
            }

//            else if (menu.equals("2")) {
//                BookSearch search = new BookSearch(manager);
//                System.out.println("\n[ 도서 검색 ]");
//                System.out.println("---------------------------------------------");
//                System.out.print("검색어 입력 (제목/저자/청구기호) : ");
//                String keyword = sc.nextLine();
//                System.out.println("---------------------------------------------");
//
//                List<Book> foundBook = search.searchBook(keyword);
//
//                if (foundBook != null) {
//                    System.out.println("-> 검색 결과:");
//                    System.out.println("   " + foundBook.toString());
//                } else {
//                    System.out.println("-> 찾는 도서가 없습니다.");
//                }
//            }
        }
    }
}
