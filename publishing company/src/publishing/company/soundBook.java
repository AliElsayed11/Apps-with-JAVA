package publishing.company;
import java.util.Scanner;
public class soundBook extends publishing{
private int playTime;
public soundBook(){
}
public soundBook(String tit,float p,int pt ){
super(tit,p);
this.playTime=pt;
}
public int get_playTime() {
return playTime;
}   
public void set_playTime(int playTime) {
this.playTime = playTime;
}
public void print_data(){
super.print_data();
System.out.println("The Play Time Is :"+playTime);
}
public void read_data(){
super.read_data();
Scanner read=new Scanner(System.in);
System.out.println("Enter The Play Time");
this.playTime=read.nextInt();
}}