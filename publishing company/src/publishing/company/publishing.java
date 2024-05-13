package publishing.company;
import java.util.Scanner;
public class publishing {
private String title;
private float price ;
public publishing(){
}
public publishing(String tit,float p){
this.title=tit;
this.price=p;
}
public String getTitle(){
return title;
}
public float getPrice(){
return price;
}
public void setTitle(String title) {
this.title = title;
}
public void setPrice(int price) {
this.price = price;
}
public void print_data(){
System.out.println("The TiTle Is :"+title+"\nand The price is:"+price);
}
public void read_data(){
Scanner read=new Scanner(System.in);
System.out.println("Enter The Title Name");
this.title=read.nextLine();
System.out.println("Enter The Price Of This Book");
this.price=read.nextFloat(); }}