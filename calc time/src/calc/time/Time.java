
package calc.time;
public class Time {
   private int hours;
   private int minutes;
    private int seconds;
    //One constructor to initialize this data to 0
public Time () {
    hours=0;
   minutes=0;
 seconds=0; 
 Good_Display();
}
//overloading constructor initialize it to fixed values.
public Time (int h,int m,int s) {
    hours=h;
    minutes=m;
    seconds=s;
     Good_Display();
}
//add the two initialized values together, leaving the result in the third
public static Time addition (Time t1, Time t2) {
Time note=new Time (t1.hours+t2.hours,t1.minutes+t2.minutes,t1.seconds+t2.seconds);
note.Good_Display();
return note;
}
// mutators methods for the attributes.
public void set_Hours(int h){
 hours=h;

}
public void set_Minutes(int m){
 minutes=m;
}
public void set_Seconds(int s){
 seconds=s;
}
//Accessor methods for the attributes.
public int get_Hours() {
 return(hours);
 
}
public int get_Minutes() {
 return(minutes);
 
}
public int get_second() {
 return(seconds);
}

//A method to display time in 11:59:59 format.
public void Display_Time(){
     System.out.print("THE TIME IS:"+hours+":"+minutes+":"+seconds); 
}

public void Good_Display(){
    minutes+=seconds/60;
    seconds=seconds%60;
    hours+=minutes/60;
    minutes=minutes%60;
}
}



