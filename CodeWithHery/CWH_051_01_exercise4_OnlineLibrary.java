package CodeWithHery;
public class CWH_051_01_exercise4_OnlineLibrary {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        //
    }
}
/*

Swaraj
1 year ago (edited)
Challenge Accepted
Solution for the problem Statement---

class JavaLibrary {
    private String[] availableBooks = new String[100];
    public String[] issuedBooks = new String[100];


    public void addBook(String bookName){

        for(int i = 0;i<availableBooks.length;i++){
            // Checking if book is already present in library
            if(availableBooks[i] == bookName){
                System.out.println("Book is already there in the library you are going to add another copy of the same book");
            }

            //Adding our book at first null value as array is declared for 100 elements
            if(availableBooks[i] == null){
                availableBooks[i] = bookName;
                System.out.println("Thanks For your contribution!!! Book '" + bookName + "' has been added in library");
                return;
            }
        }
    }

    public void showAvailableBooks(){
        // Display all books available in library
        System.out.println("Available books are");
        for (String book: availableBooks) {
            if(book == null){
                return;
            }
            System.out.println(book + "  ");
        }
    }

    public void showIssuedBooks(){
        //Display all books that are issued
        for (String element:issuedBooks) {
            if(element==null){
                return;
            }
            System.out.println(element);
        }
    }

    public void issueBook(String book){
        //Checking if book is available in library to issue
        boolean bookFound=false;
        for (int i=0;i<availableBooks.length-1;i++) {
            if(availableBooks[i] == book){
                bookFound = true;
            }
            //After verification Removing that book from available books
            if(bookFound == true){
                availableBooks[i] = availableBooks[i+1];
            }
        }
        //After verification adding book to issued books
        if(bookFound == true){
            for (int i =0 ;i<issuedBooks.length;i++) {
                if(issuedBooks[i] == null){
                    issuedBooks[i] = book;
                    System.out.println("Book '" + book + "' issued Successfully !!!");
                    return;
                }
            }
        }
        else{
            System.out.println("Book is not available right now!!!");
        }
    }

    public void returnBook(String book){
        //Checking if book is issued or not
        boolean bookFoundinissued = false;
        for (int i =0;i<issuedBooks.length;i++) {
            if (issuedBooks[i] == book){

                //Removing Book from issued books list
                bookFoundinissued = true;
                for (int j =i;j<issuedBooks.length - 1;j++){
                    issuedBooks[j] = issuedBooks[j+1];
                }
                break;
            }
        }
        //Adding book in available books list
        if(bookFoundinissued == true){
            for (int i = 0;i<availableBooks.length;i++) {
                if(availableBooks[i] == null){
                    availableBooks[i] = book;
                    System.out.println("Book '"+book+ "' is returned successfully!!!");
                    break;
                }
            }
        }
        else{
            System.out.println("It seems this book is not issued to anyone !!!");
        }

    }


}
 */