package library;
public class student_Library {
public static void main(String[] args) {
Library book_1 = new Library ("Mathematic" , 100 , 2017 , "Dr: Peter");
        Library book_2 = new Library ("physics" , 130 , 2011 , "bush");
        Library book_3 = new Library ( "programming science" , 250 , 2015 , "Robert");
        LibrarySets L = new LibrarySets ();
     L.addBook(book_1); 
     L.addBook(book_2); 
     L.addBook(book_3); 
     book_1.displayBooks();
     book_2.displayBooks();
    book_3.displayBooks();     
    }}