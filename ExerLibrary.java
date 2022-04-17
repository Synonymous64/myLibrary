import java.lang.String;
import java.util.Scanner;
class Library{
    String[] books;
    String[] returnBook;
    
    String name;
    int numOfBooks;
    Scanner sc = new Scanner(System.in);
    Library(){
        this.books = new String[100];
        this.returnBook = new String[100];

        this.books[0] = "Adventures of Huckleberry Finn - by Mark Twain";
        this.books[1] = "The Alchemist - by Paulo Coelho";
        this.books[2] = "The Adventures of Sherlock Holmes - by Arthur Conan Doyle";
        this.books[3] = "The Aleph and Other Stories - by Jorge Luis Borges";
        this.books[4] = "Aesop's Fables - by Aesop";
        this.books[5] = "Alice's Adventures in Wonderland - by Lewis Carroll";
        this.returnBook[0] = "Adventures of Huckleberry Finn - by Mark Twain";
        this.returnBook[1] = "The Alchemist - by Paulo Coelho";
        this.returnBook[2] = "The Adventures of Sherlock Holmes - by Arthur Conan Doyle";
        this.returnBook[3] = "The Aleph and Other Stories - by Jorge Luis Borges";
        this.returnBook[4] = "Aesop's Fables - by Aesop";
        this.returnBook[5] = "Alice's Adventures in Wonderland - by Lewis Carroll";
        numOfBooks = 6;
    }
    void addBooks(String books){
        this.books[numOfBooks] = books;
        this.returnBook[numOfBooks] = books;
        numOfBooks++;
        System.out.println("BOOK ADDED SUCCESSFULLY");
    }
    public void totalBooks(){
        System.out.println("\nWELCOME TO OUR LIBRARY\nTHE LIST OF THE BOOKS ARE GIVEN BELOW!!!");
        System.out.println("HAVE A LOOK");
        System.out.println("____________________________________________\n");
        for(int i = 0; i <numOfBooks; ++i){
            System.out.println((i + 1) + " " +books[i]);
        }
    }
    public void issuedBooks(String books){
        int count = 0;
        for(int i = 0; i < numOfBooks; ++i){
            if(this.books[i].equals(books)){
                returnBook[i] = books;
                this.books[i]= "ISSUED"; 
                System.out.println("Book is Issued");
                break;
            }
            count++;
        }
        if(count == numOfBooks) System.out.println("BOOK NOT FOUND");
    }
    public void returnBooks(String book){
        for(int i = 0; i < numOfBooks; ++i){
            if(this.returnBook[i].equals(book)){
                if(this.books[i].equals("ISSUED")){
                    this.books[i] = book;
                    System.out.println("BOOK ACCEPTED");
                    break;
                }
                else System.out.println("ERROR");
            }
        }
    }
}
public class ExerLibrary {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NAME");
        Scanner sc = new Scanner(System.in);
        Library m = new Library();
        m.name = sc.nextLine();
        int flag = 0;
        while(flag != 5){
            m.totalBooks();
            System.out.println("\n_________________________________________________________\n");
            System.out.println("PRESS -:\n1 - Display Books\n2 - Add Books\n3 - Issued Books\n4 - Return Books\n5 - to exit");
            int choice;
            choice = sc.nextInt();
            switch(choice){
                case 1 : {m.totalBooks(); break;}
                case 2 : {
                    System.out.println("Enter the name of the book below - :");
                    String book;
                    book = sc.nextLine();
                    book = sc.nextLine();
                    m.addBooks(book);
                    break;
                }
                case 3 :{
                    System.out.println("Enter the name of the book below - :");
                    String book;
                    book = sc.nextLine();
                    book = sc.nextLine();
                    m.issuedBooks(book);
                    break;
                }
                case 4 :{
                    System.out.println("Enter the name of the book below - :");
                    String book;
                    book = sc.nextLine();
                    book = sc.nextLine();
                    m.returnBooks(book);
                    break;
                }
                case 5 : {
                    System.out.println("ENTER DIGIT 5 TO QUIT");
                    flag = sc.nextInt();
                    break;
                }
                default :{
                    System.out.println("INVALID INPUT");
                    System.out.println("TRY AGAIN");
                }
            }
        }
        sc.close();
        
    }
}
