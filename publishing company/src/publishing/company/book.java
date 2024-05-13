package publishing.company;
import java.util.*;
public class book extends publishing{
private int pageCount;
public book(){
}
public book(String tit,float p,int Pc){
super(tit,p);
this.pageCount=Pc;
}
public int getPage_counts() {
return pageCount;
}
public void setPage_counts(int pageCount) {
this.pageCount = pageCount;
}
public void print_data(){
super.print_data();
System.out.println("The Page Count Is:"+pageCount);
}
public void read_data(){
Scanner read=new Scanner(System.in);
super.read_data();
System.out.println("Enter The Page Counts");
this.pageCount=read.nextInt();
}}  