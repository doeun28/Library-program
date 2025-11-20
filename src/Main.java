import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookInfo info = new BookInfo();

        // addBook 호출

        System.out.println("[신규 도서 추가]");
        System.out.println("--------------------------");
        System.out.printf("1. 저자 입력 : ");
        String author = sc.nextLine();
        System.out.printf("2. 제목 입력 : ");
        String title = sc.nextLine();
        System.out.printf("3. 청구기호 입력 :");
        String bookId = sc.nextLine();
        System.out.println("--------------------------");
        boolean result = info.addBook(author, title, bookId);
        System.out.println("책 추가 결과: " + result);

        // 현재까지 저장된 책 출력
        info.printBooks();
    }
}

