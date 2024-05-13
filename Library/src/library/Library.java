package library;
public class Library {
private String title;
   private int price;
   private int year;
   private String author;
   public Library (String title , int price , int year , String author){
       this.title = title;
       this.price= price;
       this.year= year;
       this.author= author;    
}
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void displayBooks(){
    System.out.println ("The book title is : " + title );
    System.out.println ("The author : " + author );
    System.out.println ( "The price is : " + price ); 
    }}