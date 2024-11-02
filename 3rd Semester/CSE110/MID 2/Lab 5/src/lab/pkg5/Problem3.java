package lab.pkg5;
import java.util.Scanner;

class book {

    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private static int count;

    book() {
    }

    book(int isbn, String bT, int nop) {
        ISBN = isbn;
        bookTitle = bT;
        numberOfPages = nop;
    }

    public int getISBN() {
        return ISBN;
    }

    public String bookTitle() {
        return bookTitle;
    }

    public int getnumberOfPages() {
        return numberOfPages;
    }

    String display() {
        String ans = "ISBN: " + ISBN
                + " Title of the Book: " + bookTitle
                + " Number of pages: " + numberOfPages
                + "Get count: " + count;
        return ans;
    }

    public int compareTo(book b) {
        if (numberOfPages > b.getnumberOfPages()) {
            return 1;
        } else if (numberOfPages == b.getnumberOfPages()) {
            return 0;
        } else {
            return -1;
        }
    }

}

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book[] arr = new book[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter ISBN [" + (i + 1) + "] : ");
            int ISBN = sc.nextInt();
            System.out.println("Enter BOOK Title [" + (i + 1) + "] : ");
            sc.nextLine();
            String bookTitle = sc.nextLine();

            System.out.println("Enter Number of Pages [" + (i + 1) + "] : ");
            int numberOfPages = sc.nextInt();

            sc.nextLine();

            arr[i] = new book(ISBN, bookTitle, numberOfPages);
        }
        System.out.println("");
        for (book i : arr) {
            i.display();
        }
    }
}