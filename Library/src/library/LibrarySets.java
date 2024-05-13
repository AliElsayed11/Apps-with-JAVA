package library;
public class LibrarySets {
     private Library [] data;
     private int storedBooks;
     public LibrarySets(){
    data= new Library [5];
}
public LibrarySets (int setSize){
   data = new Library [setSize];
}
public void addBook(Library book ){
    if (storedBooks < data.length){
        data [storedBooks] = book;
        storedBooks++;
    }
    else {
        System.out.println(" Library set is full");   
    }}}