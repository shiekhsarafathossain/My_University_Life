package labmanual05;

import java.util.Scanner;

class Book{
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private static int count;
    
    
    Book(int isbn,String booktitle,int numberofpages){
        this.ISBN = isbn;
        this.bookTitle = booktitle;
        this.numberOfPages = numberofpages; 
        updateCount();
    }
    
    Book(){
        updateCount();
    }
    
    int getnumberOfPages(){
        return numberOfPages;
    }
    
    static private void updateCount() {
        count++;
    }
    
    public String toString(){
        String str = "ISBN: "+ISBN+"\nBook Title: "+bookTitle+"\nNumber Of Pages: "+numberOfPages;
        
        return str;
    }
    
    static int getCount() {
        return count;
    }
    
    public int compareTo(Book I){
        if(numberOfPages > I.numberOfPages){
            return 1;
        }
        else if(numberOfPages == I.numberOfPages){
            return 0;
        }
        else
            return -1;
    }
    
}

public class LabProblem2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Book[] BookArray = new Book[5];
        
        for (int i = 0; i < BookArray.length; i++) {
            BookArray[i] = new Book();
            System.out.print((i+1)+") Enter ISBN: ");
            
            int isbn = input.nextInt();
            
            System.out.print((i+1)+") Enter Book Title: ");
            input.nextLine();
            String booktitle = input.nextLine();
            
            
            System.out.print((i+1)+") Enter Number Of Pages: ");
            int numberofpages = input.nextInt();
            
            
            BookArray[i] = new Book(isbn,booktitle,numberofpages);
            
        }
        displayAll(BookArray);
        
        System.out.println("Compareing first and second book page");
        System.out.println(BookArray[0].compareTo(BookArray[1]));
        System.out.println(isHeavier(BookArray[2]));
        
        
        
    }
    
    static void displayAll(Book[] b){
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i].toString());
        }  
        
    }
    
    static boolean isHeavier(Book I){
            return I.getnumberOfPages() > 500;
            
        }
}
